package com.admin.notification.mjml;
import org.openjdk.nashorn.api.scripting.JSObject;
import org.springframework.stereotype.Component;

import javax.script.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

@Component
public class MjmlRenderer {
    private ScriptEngine javascriptEngine;
    private JSObject mjml2html;

    public MjmlRenderer() {
        create();
    }

    public void create() {
        initialize();
    }

    public void initialize() {
        this.setupJavascriptEngine();
        this.setupMethodReference(this.compileJavascript(this.loadMjmlResource()));
    }

    public synchronized MjmlResultProcessor process(String mjml) {
        return new MjmlResultProcessor(this.mjml2html.call((Object)null, mjml));
    }

    private CompiledScript compileJavascript(Reader mjmlFileReader) {
        try {
            CompiledScript script = ((Compilable)this.javascriptEngine).compile(mjmlFileReader);
            script.eval();
            return script;
        } catch (ScriptException var3) {
            throw new IllegalStateException("Cannot.. ", var3);
        }
    }

    private Reader loadMjmlResource() {
        InputStream resource = this.getClass().getClassLoader().getResourceAsStream("mjml.js");

        try {
            assert resource != null;
            return new BufferedReader(new InputStreamReader(resource));
        } catch (NullPointerException var3) {
            throw new RuntimeException("Cannot load mjml resource!", var3);
        }
    }

    private void setupJavascriptEngine() {
        try {
            this.javascriptEngine = (new ScriptEngineManager()).getEngineByName("nashorn");
            this.javascriptEngine.eval("var global = this;");
        } catch (ScriptException var2) {
            throw new RuntimeException("Cannot setup javascript engine!", var2);
        }
    }

    private void setupMethodReference(CompiledScript script) {
        this.mjml2html = (JSObject)((JSObject)((JSObject)script.getEngine().get("global")).getMember("mjml")).getMember("mjml2html");
    }
}
