package itexto.issuer

import static org.junit.Assert.*
import org.junit.*

class UsuarioServiceTests {
	def usuarioService
	
    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testIsCliente() {
        assertFalse usuarioService.isCliente(null)
		Usuario usuario = new Usuario(username:"teste", password:"teste").save(failOnError:true)
		new UsuarioPermissao(usuario:usuario, permissao:Permissao.findByAuthority("ROLE_CLIENTE")).save(failOnError:true)
		assertTrue usuarioService.isCliente(usuario)
		Usuario usuario2 = new Usuario(username:"teste2", password:"teste2").save(failOnError:true)
		assertFalse usuarioService.isCliente(usuario2)
		
    }
}
