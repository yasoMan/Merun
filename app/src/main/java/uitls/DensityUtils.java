�}  �%  �����M�v�u
��$�D�程��C?kRd`C*Aw��� L�8��91MXEO��i��-�d\���%�B���F�`�����I �ی���?�6�>�q�7K��G��R������u�ri谻�����Y6�X���2��ڛ�-M"FQ�����bŕ��
�#���||YKZ�h(\#�$Ȭnɱ�}�� à n�K���Z v;�SW�,G�||�s���{�����ڙ��%D�g�
����?Y��N��Bn�1&��#�1�G+�t�+�ʸ�8��y�ڣD�8ȼ8�p���k���Z\a�ے#�L���tǊ8P}�[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l�*���E60xk�<�a6Z�(!@��7#��z�a5�( ��
���ݡ�å^ KoFD#�S@o��9>�Lf�� t�Ǘ	���H}��O|<N�3;��z<Mzz)]H=�����Ax��K�/8]|���E�4���I����1��0ǐ����4�B�za��n=���&c_(k�]F�o�Ou�6Is�����t�"rQ�����'���3(�ӳ�7qx8V;���g8�(�zT�t\7���(8�6t��p"47�b��&�5���C�wGg���Wj���D� &}66��Y��}�&�0�;���?��_�m�c�Co��e]����2ft�ZB��x�y���VhC�lk�(��VdƐ�2N6��&\�}�X/�٬= ��`z�nB�QQC�����ȷDZP�yAO�z���������ɠ�_U��3>����+h�������@�B �ʷS��R�����o��I7W��D�0�6�$ݯt
     * @param pxVal
     * @return
     */
    public static float px2dp(Context context, float pxVal)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * px转sp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2sp(Context context, float pxVal)
    {
        return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
    }
}
