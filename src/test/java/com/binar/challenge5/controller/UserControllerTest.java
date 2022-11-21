package com.binar.challenge5.controller;

import com.binar.challenge5.repositories.UsersRepository;
import com.binar.challenge5.service.Interface.UsersService;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private UsersService usersService;

    @Mock
    private UsersRepository usersRepository;
//
//    @BeforeEach
//    public void init() {
//        MockitoAnnotations.openMocks(this);
//        mahasiswaService = new MahasiswaService(this.mahasiswaRepository);
//        this.mahasiswaRepository = Mockito.mock(MahasiswaRepository.class);
//    }
//
//    @Test
//    public void whenGetExistingMahasiswa_returnMahasiswa() throws Exception {
//        this.mockMvc.perform(MockMvcRequestBuilders.get("/mahasiswa/search_mahasiswa")
//                        .param("nama", "Rizky").param("angkatan", "2019"))
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(content().json("{" +
//                        "\"idMahasiswa\" : 5," +
//                        "\"nama\" : \"Rizky\"," +
//                        k      "\"jurusan\" : \"Teknik Informatika\"," +
//                        "\"angkatan\" : 2019," +
//                        "\"kodeJurusan\" : \"01\"," +
//                        "\"kelas\" : null" +
//                        "}"))
//                .andReturn();
//    }

//    @Test
//    public void whenNewMahasiswa_returnStatusInsert() throws Exception {
//        this.mockMvc.perform(MockMvcRequestBuilders.post("/mahasiswa/new_mahasiswa")
//                        .content("{" +
//                                "\"nama\" : \"Test Nama\"," +
//                                "\"jurusan\" : \"Test Jurusan\"," +
//                                "\"angkatan\" : 2020," +
//                                "\"kodeJurusan\" : \"00\"" +
//                                "}")
//                        .header("kelas", "test kelas")
//                        .header("Content-Type", "application/json")
//                        .header("accept", "*/*"))
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(content().json("{" +
//                        "\"kelas\" : \"test kelas\"," +
//                        "\"message\" : \"insert success!\"" +
//                        "}"))
//                .andReturn();
//        Mahasiswa mahasiswa = new Mahasiswa();
//        mahasiswa.setIdMahasiswa(Integer.valueOf(LocalDate.now().getYear()
//                + "00"));
//        mahasiswa.setNama("Test Nama");
//        mahasiswa.setJurusan("Test Jurusan");
//        mahasiswa.setAngkatan(2020);
//        mahasiswa.setKodeJurusan("00");
//        Mockito.verify(mahasiswaService, Mockito.times(1))
//                .newMahasiswa(Mockito.any(Mahasiswa.class));
////        Mockito.verify(mahasiswaRepository, Mockito.times(1))
////                .save(Mockito.any(Mahasiswa.class));
//    }
}
