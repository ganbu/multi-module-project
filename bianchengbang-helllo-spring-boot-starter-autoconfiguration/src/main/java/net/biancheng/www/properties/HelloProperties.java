package net.biancheng.www.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("net.biancheng.www.hello")
public class HelloProperties {

    private String suffix;
    private String prefix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
