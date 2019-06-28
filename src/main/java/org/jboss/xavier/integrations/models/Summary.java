package org.jboss.xavier.integrations.models;

public class Summary {

    private String provider;
    private String product;
    private String version;
    private Long hypervisors;
    private Long sockets;
    private Long clusters;
    private Long vms;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getHypervisors() {
        return hypervisors;
    }

    public void setHypervisors(Long hypervisors) {
        this.hypervisors = hypervisors;
    }

    public Long getSockets() {
        return sockets;
    }

    public void setSockets(Long sockets) {
        this.sockets = sockets;
    }

    public Long getClusters() {
        return clusters;
    }

    public void setClusters(Long clusters) {
        this.clusters = clusters;
    }

    public Long getVms() {
        return vms;
    }

    public void setVms(Long vms) {
        this.vms = vms;
    }
}
