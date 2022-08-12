package overloading;

public class Students {
	public void getStudentsInfo( int id) {
		System.out.println("id: "+id);
	}
		public void getStudentsInfo( int id,String name) {
			System.out.println("id-"+id+ " name-"+name);
		}
			public void getStudentsInfo( int id,String name,String mail) {
				System.out.println("id-"+id+" name-"+name+" mail-"+mail);
			}
			public static void main(String[] args) {
				Students obj =new Students();
				obj.getStudentsInfo(5);
      			obj.getStudentsInfo(9,"abi");
			obj.getStudentsInfo(58,"abi","abi@gmai.com");
				
			}
		
	}


