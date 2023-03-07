package etu1813.framework.servlet;

public class Utilitaire {
    public String getProcessUrl(String url){
        String[] parts = url.split("//");
        String[] parts2 = parts[1].split("/");
        
        return parts2[2];
        
    }
}
