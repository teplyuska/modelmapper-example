package modelmapper.example.demo;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

class Mapper {
    private ModelMapper mapper;

    Mapper() {
        mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    void setupMappingsError() {
        mapper.addMappings(new PropertyMap<From, To>() {
            @Override
            protected void configure() {
                skip().setId(null);
            }
        });
    }

    void setupMappingsSuccess() {
        mapper.addMappings(new FromToMap());
    }

    void validate() {
        mapper.validate();
    }
}
