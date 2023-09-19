package com.cgm.tech;

import com.cgm.tech.model.dto.VisitDTO;
import com.cgm.tech.repository.VisitRepository;
import com.cgm.tech.service.VisitService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@AutoConfigureJsonTesters
@SpringBootTest
@AutoConfigureMockMvc
@RequiredArgsConstructor
public class VisitServiceTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private VisitService visitService;

    @Test
    public void canRetrieveVisitWhenExist() throws Exception {
        // given
        given(visitService.getVisitById(1001L))
                .willReturn(new VisitDTO());


        // when
        MockHttpServletResponse response = mvc.perform(
                        get("/visit/2")
                                .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

    }
}
