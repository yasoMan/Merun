�}+  I%  
$��n�xv�u
��:�D��K��'}Sm��V#Rl��'O����FPf�-Af��E�AG?H��HWpE�(����dw�:��>9�4��S g�)i\M!���$�|f��U*a�j�!��U���ad)�c�H�%�騚��� ̋�5/���N�% e5�K^��f�h>���o�P��9E&���n��H)�
�:�iߡ���܆:A�%|O��(��tBbҘO"S�Q'C���V�����=7N'�����wz%���Q�"�����)���c�@[�_����������-H�p��rL��"�}�B|�DU_�CP�(���M��]�B��wp��8��p�&��Y-��\�+C78$ ���i`�C;��?�t2���ͽ�ԉ��X�Gt��⮫��|��*G o�A!�̨�,2�tI�����(���q4����nQ{�a�Q�Ԣ%�xj'B��L4J�[Z�B(��������l*|=<����Zw��[�֠!��P�y�w����e*�f;�Ʃ�(��n�B�w�υ`��$���q�H�7�k�@Vj�l��i�e�M%����f0�����i�=��04���0�QN�!�ħ��\� ���WAȅA=��r��1�I����U�[�z���H��a�{kfo��]c�Xc��=8�R,?�1�n�2&��4rT���/�P�u�PJ?[@~Y>��pC)OG
��2��&��u��U�r�k5�.ɧ���mw9
>i��<A���)���_��n{ĺ`z���-i��~Lʥ@�0� �{Ǡ�7(� �1��K�>���v�������'���i��cZ;�<��ܗ�pt�K���w�d�� �O +Ű2�7/��z�DU�A!e�F�G�^�!D�(�;e˳f�Zp�I�j�s��}|@q^���:^�m�D�(byӲ�9�\�,!m�v��.���r(�l�E�W q��+¿1UX��e�M�w�����͍=�����lD%T���׾D>�ќD1o_³"��[���V!$�ڔo_&�zr>�����f�j��~u�ُǠo����Z��54��$�W���>G���1��b�d`Oh��v��Ȃ��+µ�ȇ쇷b�ݪ���y�DL����	�B�1�w�쇊\Kʒȷs���
�c��
�"�+�A%YVe�D����#���{)۝~��C�Wz�*��h�^v�}9TD��w�	�[�Y#�1mX�����Փ<y��ϚJ�����$�^��l�qK� ����^�\�:"�'�.�G��m��t=���Oc��!���C_w�t9�t`�l>���2?�œ=�MP!�j,4	뱍t ��+9pW<�����ĩ����Y�C3&�Ti�5��*�ؾ�8�}W��u�������8���M�� �L.J ]�?���.6S� �~Jv��/��j]L6��U�"|9D
����b�<����u՞�/1��H���ٛ��a$�o��$���]�v��dl"�z�^1������ѭv3V(��L-ZH���-lhA���qټ&�HA��UV�ڌ������bL��w�͑��^e��I���	ޘ����U�v:��	����\��n�=����nԔ�In<�e�1��0��
���i�%�᱆�_�hnpb��� �fh�7�HZ\k
,c�~�3y2��^֋y�1���t�A	5t��vղf�$X���-����s/��y���zDiOax)jF�Ҥ�ѨG7����K�@xy+_z��@W(ƽqG�������s�p%��#zָ����˂'�dP����H�S���f�7�=d��CF6>w��ղ�Ts��>�l��[�DH����Vf�;����fG%��9�
�|Y�jM��q�W���Wr�f�yiFϻ�M.%8(��	K��~_�^G��p1���d�-�j�f�G~1������@�%�ua��`��Bwvֺ,pz�3we:��r�l�Q+0ҧ�Dier.append(String.format(formatter, constraint.toString()));
            }
            if (index < columnCount - 1) {
                stringBuilder.append(",");
            }
            index++;
        }
        stringBuilder.append(");");
        db.execSQL(stringBuilder.toString());
    }

    public void delete(final SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS " + mTableName);
    }
}
