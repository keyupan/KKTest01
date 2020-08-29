package com.KK.mail;

public class Mail {
    private String subject;//主题
    private String body;//内容

    private String from;//发件人
    private StringBuilder to;//收件人
    private StringBuilder cc;//抄送

    public Mail(){}

    public Mail(String from){
        this(null,null,from,null);
    }

    public Mail(String subject, String body, String from, String to) {
        this.subject = subject;
        this.body = body;
        this.from = from;
        this.to.append(to);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to.toString();
    }

    public void setTo(String to) {
        this.to.append(to);
    }

    public String getCc() {
        return cc.toString();
    }

    public void setCc(String cc) {
        this.cc.append(cc);
    }
}
