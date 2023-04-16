package webcaisse.model;

import java.text.ParseException;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author patrick
 */
public class TestPointsFidelite {

    public void testAddFideliteTampon() throws ParseException {
        ConsoFidele consoTest = new ConsoFidele("Lifo", "Paul",
                "lifo.paul@gmail.com", "0600000000",
                new SimpleDateFormat("yyyy-MM-dd").parse("1961-01-03"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-05"));
        consoTest.addFidelite(1, 50);

        assertEquals("erreur calcul 1er tampon", 1, consoTest.getPointsFidelite(), 0);
        consoTest.addFidelite(1, 20);
        assertEquals("erreur calcul 2ème tampon ", 2, consoTest.getPointsFidelite(), 0);
    }

    public void testAddFideliteMontant() throws ParseException {
        ConsoFidele consoTest = new ConsoFidele("Lifo", "Paul",
                "lifo.paul@gmail.com", "0600000000",
                new SimpleDateFormat("yyyy-MM-dd").parse("1961-01-03"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-05"));
        consoTest.addFidelite(2, 150);
        assertEquals("erreur calcul 1er achat", 150, consoTest.getPointsFidelite(), 0);
        consoTest.addFidelite(2, 250);
        assertEquals("erreur calcul 2ème achat", 400, consoTest.getPointsFidelite(), 0);
    }

    public void testInitConso() throws ParseException {
        ConsoFidele consoTest = new ConsoFidele("Lifo", "Paul",
                "lifo.paul@gmail.com", "0600000000",
                new SimpleDateFormat("yyyy-MM-dd").parse("1961-01-03"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-05"));
        // À compléter
    }

    public void testAddMontant() throws ParseException {
        ConsoFidele consoTest = new ConsoFidele("Lifo", "Paul",
                "lifo.paul@gmail.com", "0600000000",
                new SimpleDateFormat("yyyy-MM-dd").parse("1961-01-03"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-05"));
        // À compléter
    }
}
