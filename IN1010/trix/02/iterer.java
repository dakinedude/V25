public void iterer(HashMap studenter) {
    for (String student : studenter.keySet()) {
        System.out.println(student);
    }

    for (Student student : studenter.values()) {
        System.out.println(student.toString());
    }
}
