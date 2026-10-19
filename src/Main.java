//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
            Usuario u1 = new Usuario("jperez", "jperez@correo.com");
            Usuario u2 = new Usuario("m_gomez", "maria@correo.com");
            Usuario u3 = new Usuario("c_ruiz", "carlos@correo.com");
            Usuario u4 = new Usuario("ana_dev", "ana@correo.com");

            System.out.println("Usuario ID " + u1.getId() + ":\n" + u1.getUsername() + "\nCorreo:\n" + u1.getCorreo());
            System.out.println("Usuario ID " + u2.getId() + ":\n" + u2.getUsername() + "\nCorreo:\n" + u2.getCorreo());
            System.out.println("Usuario ID " + u3.getId() + ":\n" + u3.getUsername() + "\nCorreo:\n" + u3.getCorreo());
            System.out.println("Usuario ID " + u4.getId() + ":\n" + u4.getUsername() + "\nCorreo:\n" + u4.getCorreo());

            System.out.println("\nTotal de usuarios: " + Usuario.getTotalUsuarios());
}
