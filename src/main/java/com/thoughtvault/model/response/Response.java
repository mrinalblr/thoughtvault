package com.thoughtvault.model.response;

public class Response {
    private String status;
    private Object metainfo;
    private String error;

    public Response(String status, Object metainfo, String error) {
        this.status = status;
        this.metainfo = metainfo;
        this.error = error;
    }

    public Response() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getMetainfo() {
        return metainfo;
    }

    public void setMetainfo(Object metainfo) {
        this.metainfo = metainfo;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
