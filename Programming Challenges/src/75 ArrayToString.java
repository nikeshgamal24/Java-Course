class ArrayToString {
    public static void main(String[] args){
        String[] arr = new String[]{"This","is","the","most","time","spent","course","on","Java","by","me."};
        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            sb.append(str).append(" ");
        }

        System.out.println(sb);
    }
}
