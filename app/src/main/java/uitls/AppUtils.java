�}�  ��  zqL����v�u
��7�D��嬋�B?B�b}Յ���s��(|^Z�O�
���rE��i�QA��t�8I��k�[�3Iɿ�T�"y�%x|EAܔ���.�����,��<��!P�fS}j�*�2�o�z�Z%���pZ"�[L����\/Q�^�����m^���@eppE�A{5��nf�.14b� (J^�i^�t���-�����5l$��a�zU.�O"RC�����~�>-C�\�ᡯQ0�QoL� Ǚ*Ժ��<�]c��֠�O��8�D���
���8�N��F9]U`$�x�.�ĥ���
(�z���W}s{C�6��n���b���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l��U;�9LD,��G�8-0e��>]n$^u�,��/��l�S�N�	�~Qe�z�=�:�A�d$c��E5*��}5��7��:��mJ\�g4Qݸ�5���/r;��'���.�m�������������k�*�#�4��;�V���y���:!��<��.����ϯgn"�A�M�����,��D1,�K���
(��*�1����'�3�M��GL��D�3Sę)�/�v�'�ԝ]��[�ov��Q���H!��BVy�07=�T��>�%[�H�vÅ�/o)�x	��^� ?�Ώ�j�%h�OXb?ǽ���4%�??nԘU�������͹��(򞔞�0N]�͒'u��I)#�n݊"Л*�6o�a��ܷ�s+�c�|Eg=ׅ����V"��䫘I�)�{MU@�yL67fD���}��b����v�bT�ϥK;����5Q䅺B�QZB�.K
�鞉$�
-	�z|޵����o���� <װ���`I��ͣ�flD*|`��XAJ�|tE��V�"���DcY�A����vXN��է�W���]�,މ>.���#hHb ��z��_�@1�0�P��6*�:�23XĚ�9��
��S���n��~}�n�I4�u�+{O���8Z��:���͸dry�����y��(L�߇�,`��h�%��$,<�ڌ���������B���s�'pB� �Ev!t�B>�R�����p�h1��lC 0l�,�u�Ǝ�탍��{zcι�uBJ���{���y
�70Q+YyB��fN�5~e �M��<��cz
��K5~$�^���;�^ٮ��O���N���AU�2S3�Oc`�z�i�x�ca�ʗ�m�lI8d]d[�	G��p����iH^��]�r ?5�i�x�1�&��0�HTgޓ�Rw5]:)ւX���|q7�?���-W�X�|���~) �Q����6�NGRܳ/g�:�ޒ����^%e�Vk�)����V     {
            e.printStackTrace();
        }
        return null;
    }
/**判断是否是中文*/
    public static boolean iszh(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        if (language.endsWith("zh"))
            return true;
        else
            return false;
    }
}
