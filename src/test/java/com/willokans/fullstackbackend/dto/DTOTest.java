package com.willokans.fullstackbackend.dto;

import com.willokans.fullstackbackend.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.meanbean.test.BeanTester;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DTOTest {

    @Test
    @DisplayName("Test all DTO's setter and getters")
    void testAllDTOs(){
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(User.class);
    }
}
