package modelmapper.example.demo;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

class Mapper {
    private ModelMapper mapper;

    Mapper() {
        mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        setupMappings();
    }

    private void setupMappings() {
        mapper.addMappings(new PropertyMap<From, To>() {
            @Override
            protected void configure() {
                skip().setId(null);
            }
        });
    }

    void validate() {
        mapper.validate();
    }
}
