import java.util.Scanner;

class StudentRecord {
	static String institute = "University of Rajshahi";
	String id;
	String name;
	String phoneNumber;
	String cgpa;

	// Start Constructors;
	StudentRecord(String id, String name, String phoneNumber, String cgpa) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.cgpa = cgpa;
	}

	StudentRecord(String id, String name) {
		this.id = id;
		this.name = name;
		this.phoneNumber = "Not Provided";
		this.cgpa = "Not Found";
	}

	StudentRecord(String id, String name, String cgpa) {
		this.id = id;
		this.name = name;
		this.phoneNumber = "Not Provided";
		this.cgpa = cgpa;
	}

	StudentRecord() {

	}
	// End Constructors;

	// Start Methods;
	void showShort() {
		System.out.println("ID: " + this.id + ",Name: " + this.name);
		// System.out.print();
	}

	void showRecords() {
		// this.cgpa = Float.parseFloat(this.cgpa)+1;
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Institute: " + institute);
		System.out.println("Phone Number: " + this.phoneNumber);
		System.out.println("CGPA: " + this.cgpa);
	}
	// End Methods;

}

// Start Main Class;

public class StudentManagement {
	// Scanner input = new Scanner(System.in);
	// public StudentRecord[] students = new StudentRecord[50];
	public static StudentRecord[] students = new StudentRecord[50];
	public static int lastId = 1;

	public static void create() {
		lastId = lastId + 1;
		Scanner input = new Scanner(System.in);
		students[lastId] = new StudentRecord();
		System.out.print("ID: ");
		students[lastId].id = input.nextLine();
		System.out.print("Name: ");
		students[lastId].name = input.nextLine();
		System.out.print("Phone Number: ");
		students[lastId].phoneNumber = input.nextLine();
		System.out.print("CGPA: ");
		students[lastId].cgpa = input.nextLine();
		System.out.println("New Record Created");
	}

	public static void show() {
		System.out.println("Showing a summary");
		if (lastId >= 0) {
			for (int i = 0; i <= lastId; i++) {
				students[i].showShort();
			}
		} else
			System.out.println("List is Empty");
	}

	public static void search() {
		int flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Searching Record");
		System.out.println("id: Search by ID\nname: Search by Name");
		System.out.print(">");
		String choice = input.nextLine();
		if (choice.equals("id")) {
			System.out.print("ID:");
			String searchPhrase = input.nextLine();
			if (lastId >= 0) {
				for (int i = 0; i <= lastId; i++) {
					if (students[i].id.equals(searchPhrase)) {
						students[i].showRecords();
						flag = 1;
					}
				}
			} else
				System.out.println("List is Empty");

		} else if (choice.equals("name")) {
			System.out.print("Name:");
			String searchPhrase = input.nextLine();
			if (lastId >= 0) {
				for (int i = 0; i <= lastId; i++) {
					if (students[i].name.equals(searchPhrase)) {
						students[i].showRecords();
						flag = 1;
					}
				}
			} else
				System.out.println("List is Empty");
		} else {
			System.out.println("Wrong Input, please try again");
		}
		if (flag == 0) {
			System.out.println("No Record Found");
		}
	}

	public static void edit() {
		System.out.println("Updating Record");
		int flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("id: Update by ID\nname: Update by Name");
		System.out.print(">");
		String choice = input.nextLine();
		if (choice.equals("id")) {
			System.out.print("ID:");
			String searchPhrase = input.nextLine();
			if (lastId >= 0) {
				for (int i = 0; i <= lastId; i++) {
					if (students[i].id.equals(searchPhrase)) {
						System.out.println("Caution your change will be permanent\nLeave Blank to keep unchanged");

						System.out.println("Previous ID: " + students[i].id);
						System.out.print("New ID: ");
						String newId = input.nextLine();
						if (newId.equals("")) {
							System.out.println("ID left as it is");
						} else {
							students[0].id = newId;
						}

						System.out.println("Previous Name: " + students[i].name);
						System.out.print("New Name: ");
						String newName = input.nextLine();
						if (newName.equals("")) {
							System.out.println("Name left as it is");
						} else {
							students[0].name = newName;
						}

						System.out.println("Previous Phone Number: " + students[i].phoneNumber);
						System.out.print("New Phone Number: ");
						String newPhoneNumber = input.nextLine();
						if (newPhoneNumber.equals("")) {
							System.out.println("Phone Number left as it is");
						} else {
							students[0].phoneNumber = newPhoneNumber;
						}

						System.out.println("Previous CGPA: " + students[i].cgpa);
						System.out.print("New CGPA: ");
						String newCgpa = input.nextLine();
						if (newCgpa.equals("")) {
							System.out.println("CGPA left as it is");
						} else {
							students[0].cgpa = newCgpa;
						}

						flag = 1;
					}
				}
			} else
				System.out.println("List is Empty");

		} else if (choice.equals("name")) {
			System.out.print("Name:");
			String searchPhrase = input.nextLine();
			if (lastId >= 0) {
				for (int i = 0; i <= lastId; i++) {
					if (students[i].name.equals(searchPhrase)) {
						students[i].showRecords();
						flag = 1;
					}
				}
			} else
				System.out.println("List is Empty");
		} else {
			System.out.println("Wrong Input, please try again");
		}
		if (flag == 0) {
			System.out.println("No Record Found");
		}

	}

	public static void clear() {
		System.out.println("Deleting Record");
		int flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Searching Record");
		System.out.println("id: Search by ID\nname: Search by Name");
		System.out.print(">");
		String choice = input.nextLine();
		if (choice.equals("id")) {
			System.out.print("ID:");
			String searchPhrase = input.nextLine();
			if (lastId >= 0) {
				for (int i = 0; i <= lastId; i++) {
					if (students[i].id.equals(searchPhrase)) {
						students[i].showRecords();
						flag = 1;
					}
				}
			} else
				System.out.println("List is Empty");

		} else if (choice.equals("name")) {
			System.out.print("Name:");
			String searchPhrase = input.nextLine();
			if (lastId >= 0) {
				for (int i = 0; i <= lastId; i++) {
					if (students[i].name.equals(searchPhrase)) {
						students[i].showRecords();
						flag = 1;
					}
				}
			} else
				System.out.println("List is Empty");
		} else {
			System.out.println("Wrong Input, please try again");
		}
		if (flag == 0) {
			System.out.println("No Record Found");
		}
	}

	public static String display() {

		System.out.println("Welcome to Student Management");
		System.out.println("new: To create new record");
		System.out.println("view: to view a short record");
		System.out.println("find: to search a record");
		System.out.println("update: to edit a record");
		System.out.println("delete: to delete a record");
		System.out.print(">");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		// System.out.println(
		return word;
	}

	// Start Main;

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		students[0] = new StudentRecord("1911177149", "Md. Takrim Ul Alam", "01780156361", "2.1");
		students[1] = new StudentRecord("1910977115", "Md. Shehab Shahriar", "01712647844", "3.3");
		while (true) {
			String message = display();
			if (message.equals("exit")) {
				break;
			} else if (message.equals("new")) {
				create();
			} else if (message.equals("find")) {
				search();
			} else if (message.equals("view")) {
				show();
			} else if (message.equals("update")) {
				edit();
			} else if (message.equals("delete")) {
				clear();
			}
		}
		// StudentRecord students = new StudentRecord("191177149","Md. Takrim Ul
		// Alam","2.6");
		// students.showRecords();
	}
	// End Main;

}

// End Main Class;