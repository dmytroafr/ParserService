package com.e_chem.parsingprom.ProductService;

import com.e_chem.parsingprom.elements.Item;
import com.e_chem.parsingprom.elements.Rss;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

@Service
public class ParsingProductService {

    private final ProductsRepository productsRepository;

    public ParsingProductService(ProductsRepository productsRepository) throws MalformedURLException {
        this.productsRepository = productsRepository;
    }

    public List<Item> setUp() throws MalformedURLException {
        URL url = URI.create("https://e-chem.com.ua/google_merchant_center.xml?hash_tag=151778932e49baac7cf22ba2c4b764a2&product_ids=&label_ids=&export_lang=uk&group_ids=").toURL();

        Rss rss = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);
            rss = (Rss) jaxbContext.createUnmarshaller().unmarshal(url);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        return rss.getChannel().getItemList();
    }





    public void saveInDb (List<Item> products) {

        List<Product> list = products.stream().map(item -> {

            Product.ProductBuilder builder = Product.builder();

            builder.title(item.getTitle());
            builder.productDescription(item.getDescription());
            String[] split = item.getPrice().split("\\s");
            builder.price(new BigDecimal(split[0]));
            builder.photoUrl(item.getImage_link());
            builder.onStock(item.getAvailability());
            builder.producer(item.getBrand());

            return builder.build();
        }).toList();
        productsRepository.saveAll(list);
    }




}
