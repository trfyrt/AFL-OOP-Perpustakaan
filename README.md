# AFL 1: Case Study: Library

## About the Project
The Library Management System is a Java application that offers a range of features to manage a library. It supports functions such as managing librarians, collections (including books, magazines, and CDs), authors, publishers, library members, and library transactions based on user input.

## User Roles
Depending on the user's choice at the beginning of the program, different features and operations are available:

- **Visitor**: Can read books and consider signing up to become a member.
- **Member**: Can read, borrow and return books, also view available collections.
- **Librarian**: Has full access to manage collections, authors, publishers, members, and transactions.

## Colletion Controller
The `Collection Controller` handles operations related to library collections, such as books, magazines, and CDs:

- **Add Collection**: addKoleksi();
- **Show All Collections**: tabelKoleksi();

## Author & Publisher Controller
The `Author & Publisher Controller` is responsible for managing operations related to book authors & Publishers:

- **Add Author**: addPengarang();
- **Show All Authors**: tabelPengarang();
- **Add Publishers**: addPublisher();
- **Show All Publishers**: tabel

## Librarian Controller
The `Librarian Controller` manages operations related to librarians:

- **Show All Librarians**: tabelPustakawan();

## Member Controller
The `Member Controller` handles operations for library members:

- **Add Member**: addMember();
- **Show All Members**: tabelMember();

## Transaction Controller
The `Transaction Controller` manages library transactions, such as borrowing and returning:

- **Add Transaction (Borrow)**: addTransaksi();
- **Add Transaction (Return)**: addTransaksi();
- **Show All Transactions**: tabelTransaksi();

## Data Output
The data you input during the program is organized and displayed in table format for clarity. When the program stops, all collected data is written to a text file named `input_output.txt` using a `PrintWriter` object named `out`. This ensures that all data is saved and can be accessed later, providing a persistent record of library-related information.

## Getting Started
To run this project, follow these steps:
1. Make sure you have the Java Development Kit (JDK) installed.
2. Clone or download this repository.
3. Open a terminal and navigate to the project directory.
4. Compile the code with `javac main.java`.
5. Run the program with `java main`.

## Potential Issues
Here are some common problems and their solutions:
- **NoSuchElementException**: This error can occur if a `Scanner` is closed too early. Make sure to keep the `Scanner` open until the program is done.
- **InputMismatchException**: This happens when the input doesn't match the expected type. Use `try-catch` to handle this and guide users to enter correct input.

## Contact
If you have any questions or issues with this project, please contact Aaron Kongdoh at abenedict01@student.ciputra.ac.id.
