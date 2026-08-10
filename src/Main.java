//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int a = sc.nextInt();

        int[] arr = new int[a];

int c =0;
        // Input
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element :");
        int d = sc.nextInt();
        for (int i = 0; i < a; i++) {
             if(arr[i]==d){

                 c++;
             }
        }

        System.out.println(c);

    }
}
