@ECHO OFF
CD /D "%~dp0"

:INIT
    ECHO.
    ECHO Chrome Portable ����ű�
    ECHO.
    ECHO     ����: ��Ȼ����
    ECHO     ��վ: https://www.portablesoft.org/
    ECHO.
    ECHO �������:
    ECHO.
    ECHO     1 ���� Chrome Portable ��ΪĬ�������
    ECHO     2 ����ʹ�� Chrome Portable ��ΪĬ�������
    ECHO     3 ����ɾ�� Chrome Portable �������
    ECHO     4 �˳����ű�
    ECHO.
    SET /p ACTION="������������:"
    IF "%ACTION%"=="1" GOTO MAKE_DEFAULT_BROWSER
    IF "%ACTION%"=="2" GOTO CLEAR_DEFAULT_BROWSER
    IF "%ACTION%"=="3" GOTO UNINSTALL
    IF "%ACTION%"=="4" GOTO END
    CLS
    GOTO INIT

:MAKE_DEFAULT_BROWSER
    "%~dp0ChromePortable.exe" --make-default-browser
    CLS
    GOTO INIT
   
:CLEAR_DEFAULT_BROWSER
    "%~dp0ChromePortable.exe" --clear-default-browser
    CLS
    GOTO INIT
    
:UNINSTALL
    "%~dp0ChromePortable.exe" --uninstall
    CLS
    GOTO INIT

:END
    EXIT