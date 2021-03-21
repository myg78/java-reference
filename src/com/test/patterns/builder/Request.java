package com.test.patterns.builder;

public class Request {

    private String header;
    private String body;
    private String footer;
    private String notes;

    public Request(Builder builder) {
        this.header = builder.getHeader();
        this.body = builder.getBody();
        this.footer = builder.getFooter();
        this.notes = builder.getNotes();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Request{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + footer + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

    public static class Builder {

        private String header;
        private String body;
        private String footer;
        private String notes;

        public static Builder standard() {
            return new Builder();
        }

        public String getHeader() {
            return header;
        }

        public String getBody() {
            return body;
        }

        public String getFooter() {
            return footer;
        }

        public String getNotes() {
            return notes;
        }

        public Builder withHeader(String header) {
            this.header = header;
            return this;
        }

        public Builder withBody(String body) {
            this.body = body;
            return this;
        }

        public Builder withFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public Builder withNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public Request build() {
            return new Request(this);
        }

    }

}
