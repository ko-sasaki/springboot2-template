package net.ksasaki.template.core;


import lombok.Getter;

public enum CacheKeyType {

    SAMPLE(CacheKeyType.SAMPLE_KEY, 2300);

    @Getter
    private String key;
    @Getter
    private long ttl;

    CacheKeyType(String key, long ttl) {
        this.key = key;
        this.ttl = ttl;
    }

    public static final String SAMPLE_KEY = "sample";

}
