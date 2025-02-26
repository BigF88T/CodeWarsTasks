package ru.sergey.SchoolPaperwork;

/**
 * Your classmates asked you to copy some paperwork for them.
 * You know that there are 'n' classmates and the paperwork has 'm' pages.
 */
public class Paper
{
    public static int paperWork(int n, int m)
    {
        //Happy Coding! ^_^
        return n <= 0 || m <= 0 ? 0 : n * m;
    }
}