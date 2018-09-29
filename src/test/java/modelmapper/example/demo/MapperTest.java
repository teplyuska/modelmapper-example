package modelmapper.example.demo;

import org.junit.jupiter.api.Test;

class MapperTest {
    @Test
    void setupMappingsTest_Error() {
        Mapper mapper = new Mapper();
        mapper.setupMappingsError();
        mapper.validate();
    }

    @Test
    void setupMappingsTest_Success() {
        Mapper mapper = new Mapper();
        mapper.setupMappingsSuccess();
        mapper.validate();
    }
}
