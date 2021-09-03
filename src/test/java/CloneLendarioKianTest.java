import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneLendarioKianTest {


    @Test
    /* Clone do Lendario Kian*/
    void testClone() throws CloneNotSupportedException {
        CloneLendarioKian kian =  new CloneLendarioKian("Andries",
                "Skalsumer Sunny Boy", "Branco e Vermelho",
                103, 105, 102, 97);

        CloneLendarioKian KianClone = new kian.clone();
        kianClone.setMother("xxx");
        kianClone.setPersistence(120);

    }


}