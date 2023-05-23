package com.admin.notification.mjml;

import org.openjdk.nashorn.api.scripting.JSObject;

public class MjmlResultProcessor {

    private String html;
    private JSObject errors;

    MjmlResultProcessor(Object result) {
        this.errors = (JSObject)((JSObject)result).getMember("errors");
        this.html = (String)((JSObject)result).getMember("html");
    }

    public String getHtml() {
        return this.html;
    }

    public JSObject getErrors() {
        return this.errors;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            MjmlResultProcessor that = (MjmlResultProcessor)o;
            return this.html != null ? this.html.equals(that.html) : that.html == null;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.html != null ? this.html.hashCode() : 0;
    }
}
