�}w  �%  w�P�	�Q�v�u
��-�D�J�i�Gl�d(`���UU���)���Ipr��4��'����b����e�%hN���
�_6�d_N���Q-IL�B����S%��r�dD�6���=�ku��L�f���� ʉ,�l�� �����c�����q�H6 :"�sء�'�;J����v]�3L�Q}�L�E���4Q� /v���Z�Y��M��RQ�����e�?R� �.'�� ~��Ν������S�E D��a��Z��/Ş��;���VD.��A�����0�Sl�h�����2�{�ݸ$=���x���	��Ǌ8P}�[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l)�*�s�z����J\��9����r�|��-R�D������-�c�v��5B��b�wpi�ȝ/��w������"�]m=dJ	=�E�<�lp 6
��F�������9�������Ow��=2���aԸH����v)�\G�Zx�I�ʒ�7kr��7�G%�E����|�Y��U��~׊��N�p�6a�D|��g� I�/oOh��X2)�~�M�W}�}=�m%�S�I���^���|[��,Ͽ�X?w��g�w�by�@��|���Z�B�t� � N��`�Yc��	��v
�K�x��\�O:�e����P6�C��"a�p��J@5�3,����9�٩C�~���gh&NYB'��h�>�8er�����s�/J3HT�*�E��-���0�"�V.|-�C�Ih!�Az�;�������a4��q�`=�[�e��x�0s��H�}���-C����DLpTהM�^0���2��؎������e�x8 �qQ��Sl�#F��o�^�)��d^
�k��ӺO��e��q'+�`q��z��ܲ�o�����Y�8+����oл��W�US� ]T��*C�L���h+��Yǵ�n����a����pz��#uM=<^��U��mZ��p1��5��d7c&�Ɠ
_��mw6a7
��;ׅbg�����&��0D1���
CR�o� �jw���`{x�)�'�oġ�Q��B���3����<\��K���֘[|f�ّ�jO�MBN�e*�Y:��gu`Pt-���D���k�/�sȅ�\�s0k�x�B`�j�u��Rޚ\��"��+=q�P�8[�&=r�лSJh{�B��hvK��6\������Г7�)7c�^A�(��m�:$��[�όw��ۋ"%�$P��&u*d��4��CZ����/Y7˥2�5��F���芺�Y�u������&�I�M}E��QQm���dm�50����K@}Yb��.佅l4����6M��@��S��<^�Y�n����l*�

    /**
     * 打开网络设置界面
     */
    public static void openSetting(Activity activity)
    {
        Intent intent = new Intent("/");
        ComponentName cm = new ComponentName("com.android.settings",
                "com.android.settings.WirelessSettings");
        intent.setComponent(cm);
        intent.setAction("android.intent.action.VIEW");
        activity.startActivityForResult(intent, 0);
    }
}
