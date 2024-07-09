package ProtoType.EfficientInvoiceGeneration;

public class Client {
    public static void main(String[] args) {
        InvoicePrototypeRegistry registry = new InvoicePrototypeRegistryImpl();
        Invoice serviceInvoice = new Invoice(123456L, "Naresh", 100.00, "Card", InvoiceType.SERVICE);
        Invoice salesInvoice = new Invoice(123456L, "Naresh", 100.00, "Card", InvoiceType.SALES);
        Invoice purchaseInvoice = new Invoice(123456L, "Naresh", 100.00, "Card", InvoiceType.PURCHASE);
        registry.addPrototype(serviceInvoice);
        registry.addPrototype(salesInvoice);
        registry.addPrototype(purchaseInvoice);

        Invoice prototypeService = registry.getPrototype(InvoiceType.SERVICE);


        Invoice newServiceInvoice = registry.clone(InvoiceType.SERVICE);
        newServiceInvoice.setInvoiceId(456789L);
        newServiceInvoice.setCustomerName("Jansi");


        System.out.println(prototypeService.getInvoiceId());
        System.out.println(prototypeService.getCustomerName());

        System.out.println(newServiceInvoice.getInvoiceId());
        System.out.println(newServiceInvoice.getCustomerName());

    }
}
