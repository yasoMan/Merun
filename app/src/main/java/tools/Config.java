�}4  |%  R�I%}cH�v�u
��8�D��묋�?B�b��V�1,���\(�\����r:ii���"�ݟ��W�}�317�������fE���/ς�\aX�=��P��Q"�q]�ۢ-��K���3�G�d�b��9�!��b��_����*L�:[;��aˠ�0^Q��Я��B��I��*2h��>��pR'���o�Б�<	~�a�m0�2�&u�yu��+M��f�/O��x��ļ���ߞ>)!'8s�����Az�a�r�s{S:I� Ɲ!񹬛n�j�o��"Y��	�o�<}��o�:^���S�&r�p�}�B���N���(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������lD$9�1R��=�lO҉T�?EMtk�D_��f�jd'��/��n��A��j{�䎵y`�b���� �h�D���q|��<��ڀ^(��u��k�y������m�Br��xI�r�'��3,j<ן���1z��8�������p����:�I@�И�&�������� Z]�ι�=����IM����I�Ŷ(�C֬8wv�L�S��n�g�L���|�[������\��ؽD�Ư�M�Y�T��I��>R<�Ċ7����cJ��u%9P�1���×���\�mv+����)([��RR �P#[RI���j�Y}��g+����4����9�����@�k�G�rCu���[�m�N|��s(_A��yn��?z�f�49϶��$U?mZ���4;�b���PW��B��e�e�����]�?i��=�K�1_mF�Y��n�W��^�\���<ܵ���5f�K��b��R�0Ho����]�mS������l�!�8XN�!�_=lX�t���C��)#����D,]7�-���b�_��]��i3u�T��El������r�8:�~����$P��0�@~��J|}!�iJP�!dۯ���@c����'�K�\[7�R��(����;Wۈ@T�Lw
�ee������ϑ�u_('�V�i�ZL�s�$��9�9N��RTF`�6P/�K~����[��ܬ8����"��}����z�#��)i���d �U���'&�d�IN�Ͻ朕 P;��G�])Q��M$�@�P#�t�I\������_����d���ڳ�2��9��������62(Gdl0�Z���3\E� ��J@٬lUrW���rP�����}�ޓ����~
��3	��O1�Q[�����n`S��8��*�)�p<��yh�#�q��8�۰�E�}�}���Xo�h)_��R���c�d ��S0�L�L[8N{%�$�-9w��*�6��)����goundInfo);
    }
    public int getBoundInfo(){
        boundInfo = (int) SPUtils.get(context,WATCHBOUND,boundInfo);
        return boundInfo;
    }
    public void setisMeasure(int ismeasure){
        SPUtils.put(context,WATCHTEMP,ismeasure);
    }
    public int getIsMeasure(){
        isMeasure = (int) SPUtils.get(context,WATCHTEMP,isMeasure);
        return isMeasure;
    }

}
