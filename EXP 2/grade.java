class grade{
    public static void main(String[] args) {
        int maths=90;
        int java=80;
        int python=70;
        int average=(maths+java+python)/3;
        if (average>=90){
            System.out.println("Grade A");
        }
        else if (average>=75 && average<90){
            System.out.println("Grade B");
        }
        else if (average>=50 && average<75){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade F");
        }
    }
}