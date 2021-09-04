import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneTroopersTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        CloneTroopers originaltrooper = new CloneTroopers(
                "Clone Original", "Republica Galatica",
                183, "V-19 Torrent", "Pistola Blaster",
                "Clone Tropper Armor"
        );
        CloneTroopers troopersClone = originaltrooper.clone();
        troopersClone.setNome("Clone Vanguarda");
        troopersClone.setVeiculo("AT-RT Walker");
        troopersClone.setArma("Blaster Rifle");

        assertEquals("CloneTroopers{nome='Clone Original', afiliacoes='Republica Galactica', altura=183, veiculo='V-19 Torrent', arma='Pistola Blaster', ferramenta='Clone Tropper Armor'}", originaltrooper.toString());
        assertEquals("CloneTroopers{nome='Clone Vanguarda', afiliacoes='Republica Galactica', altura=183, veiculo='AT-RT Walker', arma='Blaster Rifle', ferramenta='Clone Tropper Armor'}", troopersClone.toString());
    }
}