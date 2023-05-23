package com.admin.notification.mjml;

import com.admin.notification.util.ResponseUtility;
import es.atrujillo.mjml.config.template.TemplateFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class MJMLHTMLProcessor {
    private final MjmlRenderer mjmlRenderer;
    private final ResponseUtility utility;

    public String process(String template, Map<String, Object> map) {
        Context contextVars = new Context();
        map.forEach(contextVars::setVariable);
        String mjmlTemplate = TemplateFactory.builder()
                .withStringTemplate()
                .template(template)
                .templateContext(contextVars)
                .buildTemplate();

        MjmlResultProcessor mjmlProcessorResult = mjmlRenderer.process(mjmlTemplate);
        log.info("Template: {}", mjmlProcessorResult.getHtml());
        return mjmlProcessorResult.getHtml();
    }

}
