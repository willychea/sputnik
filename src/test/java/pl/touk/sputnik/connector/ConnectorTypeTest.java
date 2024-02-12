package pl.touk.sputnik.connector;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConnectorTypeTest {

    @Test
    public void shouldGetValidConnectorType() {
        assertEquals(ConnectorType.GERRIT, ConnectorType.getValidConnectorType("gerrit"));
        assertEquals(ConnectorType.STASH, ConnectorType.getValidConnectorType("stash"));
        assertEquals(ConnectorType.GITHUB, ConnectorType.getValidConnectorType("github"));
        assertEquals(ConnectorType.SAAS, ConnectorType.getValidConnectorType("saas"));
        assertEquals(ConnectorType.LOCAL, ConnectorType.getValidConnectorType("local"));

        assertEquals(ConnectorType.GERRIT, ConnectorType.getValidConnectorType("abc"));

        assertEquals(ConnectorType.GERRIT, ConnectorType.getValidConnectorType(null));

        }
        @Test
        public void shouldGetName() {
            assertEquals("gerrit", ConnectorType.GERRIT.getName());
            assertEquals("stash", ConnectorType.STASH.getName());
            assertEquals("github", ConnectorType.GITHUB.getName());
            assertEquals("saas", ConnectorType.SAAS.getName());
            assertEquals("local", ConnectorType.LOCAL.getName());
        }
}
