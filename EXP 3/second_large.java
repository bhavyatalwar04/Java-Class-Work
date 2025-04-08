class second_large {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > large) {
                second_large = large;
                large = num;
            } else if (num > second_large && num != large) {
                second_large = num;
            }
        }

        System.out.println("The second largest number is " + second_large);
    }
}