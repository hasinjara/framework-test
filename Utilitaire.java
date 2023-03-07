package etu1919.framework.utilitaire;

public class Utilitaire {
    

    public String getUrl(String url) {
        int len = url.indexOf("/") + 1;
        return url.substring(len);
    }
}
