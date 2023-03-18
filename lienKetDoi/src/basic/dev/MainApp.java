package basic.dev;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MainApp {

    static LinkedList<Integer> doublyLinkedList = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	
        int luaChon;

        do {
            System.out.println("Menu");
            System.out.println("1. Thêm phần tử vào danh sách");
            System.out.println("2. Chèn phần tử vào đầu danh sách");
            System.out.println("3. Chèn phần tử vào giữa danh sách");
            System.out.println("4. Chèn phần tử vào cuối danh sách");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("6. Xóa ví trí bắt đầu từ 0");
            System.out.println("7. Kết thúc");

            System.out.print("Lựa chọn của bạn: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    addElement();
                    break;
                case 2:
                    addFirst();
                    break;
                case 3:
                    addMiddle();
                    break;
                case 4:
                    addLast();
                    break;
                case 5:
                    displayList();
                    break;
                case 6:
                	deletelist();
                	break;
                case 7:
                    System.out.println("Kết thúc chương trình!");
                    break;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (luaChon != 7);
    }

    private static void deletelist() {
		// TODO Auto-generated method stub
    	System.out.println(">>>Lưu ý vị trí bắt đầu bằng 0 !");
    	System.out.println("Nhập vị trí muốn xóa : ");
        int m = sc.nextInt();
        doublyLinkedList.remove(m);
//        System.out.println("Dánh sách sau khi xóa : " + doublyLinkedList);
	}

	private static void addElement() {
    	System.out.println("Nhập số phần tử");
    	int z = sc.nextInt();
    	for (int i = 0; i < z; i++) {
			System.out.print("Nhập phần tử cần thêm: ");
			int element = sc.nextInt();
			doublyLinkedList.add(element);
		}        
    }

    private static void addFirst() {
        System.out.print("Nhập phần tử cần chèn vào đầu danh sách: ");
        int element = sc.nextInt();
        doublyLinkedList.addFirst(element);
        System.out.println("Đã chèn phần tử " + element + " vào đầu danh sách.");
    }

    private static void addMiddle() {
        System.out.print("Nhập phần tử cần chèn vào giữa danh sách: ");
        int element = sc.nextInt();
        int index = doublyLinkedList.size()/2;
        doublyLinkedList.add(index, element);
        System.out.println("Đã chèn phần tử " + element + " vào vị trí " + index + " trong danh sách.");
    }

    private static void addLast() {
        System.out.print("Nhập phần tử cần chèn vào cuối danh sách: ");
        int element = sc.nextInt();
        doublyLinkedList.addLast(element);
        System.out.println("Đã chèn phần tử " + element + " vào cuối danh sách.");
    }

    private static void displayList() {
        if (doublyLinkedList.isEmpty()) {
            System.out.println("Danh sách đang rỗng.");
            return;
        }

        ListIterator<Integer> iterator = doublyLinkedList.listIterator();
        System.out.println("Danh sách:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
	}

}
