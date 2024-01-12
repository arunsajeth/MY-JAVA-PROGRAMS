class Attendance
{

    void markAttendance()
    {
        System.out.println("Mass Bunk");
    }
    void markAttendance(String... s)
    {
        System.out.println(s.length+" are student present: ");

        for(String name: s)
        {
            System.out.println(name);
        }
    }
    public static void main(String a[])
    {
        Attendance mark = new Attendance();
        mark.markAttendance();
	mark.markAttendance("A","B");
	mark.markAttendance("A","C","D","E");

    }
}