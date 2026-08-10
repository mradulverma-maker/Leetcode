//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int a = sc.nextInt();


        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        int l = arr[0];
        int r = arr[a-1];
        if(l==r){
            found = true;
            System.out.println("true");
            l++;
            r++;
        }
    }
}
