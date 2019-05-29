package trelico.ru.urfu.utils;

public interface NavigationManager{

    void navigateTo(int resId);
    void navigateWithPopTo(int fragmentIdToNavigate, int fragmentIdToPop, boolean inclusive);
}
