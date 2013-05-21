package com.binaryitsystems.cloudmanager.linode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aaron on 5/16/13.
 */
public class LinodeMain {

    /**
     * An array of sample (dummy) items.
     */
    public static List<ProviderService> ITEMS = new ArrayList<ProviderService>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, ProviderService> ITEM_MAP = new HashMap<String, ProviderService>();

    static {
        // Add 3 sample items.
        addItem(new ProviderService("1", "Linodes"));
        addItem(new ProviderService("2", "NodeBalancers"));
        addItem(new ProviderService("3", "DNS"));
    }

    private static void addItem(ProviderService item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    
    public static class ProviderService {
        public String id;
        public String content;

        public ProviderService(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
