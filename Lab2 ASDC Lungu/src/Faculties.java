public enum Faculties {
    FACULTY_OF_MATH,
    FACULTY_OF_PHYSICS,
    FACULTY_OF_MEDICAL,
    FACULTY_OF_LAW;
    private static Faculties[] faculties = {
            FACULTY_OF_MATH,
            FACULTY_OF_PHYSICS,
            FACULTY_OF_MEDICAL,
            FACULTY_OF_LAW
    };

    public static Faculties getFaculty(int num) {
        return faculties[num - 1];
    }

    public int getIndex(Student student) {
        int buffer = 0;
        for (int i = 0; i < 5; i++) {
            if (student.getFaculty().equals(faculties[i])) buffer = i + 1;
        }
        return buffer;
    }


}