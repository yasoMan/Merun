�}m  x%  -E��Z��v�u
��� �D먋��9�������U�l&}s@��o�.��0b6����d�����!�S�1BV.YCN�����U	��}���������\RG��j#խm�@r��D�h�A����vfE�3�R)��ҍ��ga�0e����m��A'oި-�Zt�.�@��P�\��d
�~��<�"D�CM�,Q�����_�dx~�6�Si Xo����t#����mZ],cԅ^J�'�-�%Ɠ8�\�*�f�|l�`�4�k?�[�
6��q�#̧	�[`|38���ZB�K.�#�L���tǊ8P}�[�wb���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������lD L��ۼ���K���=sz{Po�ɘ���RS9�(��G��X�`�8�0��쿬���
�'�sT0я�������TK��"��*��t�iQc�g�Xh��+�C*�NÆt����Q��V��O>���d�X[Y��7�<�ږl���\���{�2��
�R��\t�����(1�D�_�/A�՟��W���*@���r���{MoBR�8��8����)��R�~႟��`����M[�f4�L��`g����=�Lv`j�����\D:��$��%����]��8��c�����
P׶�.Gi�QYCd\Va��%
4~"�m��ho�o��/�ݣ����Qy��FɎ��j���t�a�� ��dA�5 �@>ػ�4T*_�`�o �A������3�u��WdANA�o�K�Ŝj?;���02׀�R��T��yl��MAxCv�h��YK���N�4X�fC� $Q4�b��=�ڵZk� �ô�E]ĳ@6�vxo��Zl���TTU8;����ass);
        return contxt.bindService(intent, mos_connection, Context.BIND_AUTO_CREATE);
    }

    public void unbindManagerService() {
        mContext.unbindService(mos_connection);
    }

    public abstract void serviceConnected(MosManagerService service);
    public abstract void serviceDisconnected();
}
