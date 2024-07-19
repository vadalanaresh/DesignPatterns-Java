package com.protoType.efficientInvoiceGeneration;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

    private Map<InvoiceType,Invoice> registry = new HashMap<InvoiceType,Invoice>();
    @Override
    public void addPrototype(Invoice user) {
        if(!registry.containsKey(user.getType())) {
            registry.put(user.getType(),user);
        }
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return registry.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return registry.get(type).cloneObject();
    }
}
