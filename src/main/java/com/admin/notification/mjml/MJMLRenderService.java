package com.admin.notification.mjml;

import com.admin.notification.client.MJMLFeignClient;
import com.admin.notification.util.ResponseUtility;
import es.atrujillo.mjml.config.template.TemplateFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;

import java.util.Map;
import java.util.Objects;

@Component
@RequiredArgsConstructor
@Slf4j
public class MJMLRenderService {
    private final MJMLFeignClient mjmlFeignClient;

    public Object process(String template, Map<String, Object> map) {
        Context contextVars = new Context();
        map.forEach(contextVars::setVariable);
        String mjmlTemplate = TemplateFactory.builder()
                .withStringTemplate()
                .template(template)
                .templateContext(contextVars)
                .buildTemplate();

        Map<String, String> inputMap = Map.of("mjml", mjmlTemplate);
        Map<String, Object> responseNode = Objects.requireNonNull(mjmlFeignClient.render(inputMap));

        return responseNode.get("html");
    }

}
