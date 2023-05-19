enum Status
{
    Running,Failed,Pending,Success;
}

class EnumSwitch
{
    public static void main(String[] args) {
        Status s = Status.Success;

        switch(s)
        {
            case Running : System.out.println("All Good");
                            break;

            case Failed  :  System.out.println("Try Again");
                            break;

            case Pending :  System.out.println("Please Wait");
                            break;
                 default :  System.out.println("Done");
                            break;
        }
    }
}