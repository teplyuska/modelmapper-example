package modelmapper.example.demo;

import org.modelmapper.PropertyMap;

public class FromToMap extends PropertyMap<From, To> {
    protected void configure() {
        skip().setId(null);
    }
}