























    }

    public static void main(String angs[]) {
        Scanner scn = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.cut.print("Enter the number of elenents in the array: ");
        int n = scn.nextInt();

        // Create an array and prompt the user to input its elements
        int arr[] = new int[n];
System.out.printim("Enter the elements of the array (sorted in ascending
order):");
for (int i0; i< n; i++)}
ar[1]- scn.nextInt();
// Prompt the user to input the elewent to be searched
System.out.print("Enter the element to search: "};
int x scm.nextimt();
BinaryScarch ob - new BinaryScarch();
int result ob.binarySearch(arr, x);
// Output the rosult of the scarch
if (result---1)
else
System.out.printin{"Flement is not present in the array");