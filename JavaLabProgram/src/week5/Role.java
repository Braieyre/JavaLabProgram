package week5;

public abstract class Role {
		String role;
		public Role(String role) {
			this.role = role;
		}
		public abstract void login(String name);
		public String getRole() {
			return role;
		}
}
