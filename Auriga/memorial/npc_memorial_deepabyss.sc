prontera.gat,106,78,6	script	����s���q�m#DeepAbyss0	419,{/* 51168 */
	if(checkquest(121135)) {
		mes "[����s���q�m]";
		mes "���Ԃ̓v�����e���̒n��";
		mes "�u�v�����e���[���v�ɂĐi�s���Ă���B";
		mes "�܂��́A�v�����e���̖k���ɂ���";
		mes "�u�v�����e���吹���v��";
		mes "�������Ă��炢�����B";
		next;
		mes "[����s���q�m]";
		mes "�������ɓ�������^�������i��";
		mes "^0000FF��ԍ����̕���^000000�ɓ���̂��B";
		next;
		mes "[����s���q�m]";
		mes "���i�͓���Ȃ���������";
		mes "���̕����ɂ���";
		mes "^0000FF�b�h�́u���v�Ɏ��������^000000���Ƃ�";
		mes "�u�v�����e���[���v�ɐi�߂�B";
		next;
		mes "[����s���q�m]";
		mes "�u�v�����e���[���v�ɓ���������";
		mes "���̃��[�_�[�ł���";
		mes "�u^0000FF�V�L�i^000000�v�l�ɉ";
		mes "�ڂ����b�𕷂��ė~�����B";
		next;
		if(select("�u�吹���v�ɍs��","�����ɗ��܂�") == 2) {
			mes "[����s���q�m]";
			mes "���m�����B";
			mes "�u�v�����e���吹���v�Ɍ�������ۂ�";
			mes "���ɐ����|���Ă���B";
			mes "��낵�����ށB";
			close;
		}
		mes "[����s���q�m]";
		mes "�ł́A�v�����e���吹���O��";
		mes "�ē����悤�B";
		mes "��낵�����ށB";
		close2;
		warp "prontera.gat",232,312;
		end;
	}
	setquest 121040; //state=1
	delquest 121040;
	setquest 121035; //state=1
	delquest 121035;
	mes "[����s���q�m]";
	mes "�c�c�M�a�𐦘r�̖`���҂�";
	mes "������Řb������B";
	mes "���A���̐��E�͖ŖS�̊�@�ɂ���B";
	next;
	mes "[����s���q�m]";
	mes "�u���f�̉��v�ƌĂ΂��҂�";
	mes "�v�����e���吹���̒n������";
	mes "�h�낤�Ƃ��Ă���̂��B";
	mes "�ނ̎҂��h��΂��̐���";
	mes "�n���Ɖ������낤�B";
	next;
	mes "[����s���q�m]";
	mes "��X�́A���f�̉��̕�����";
	mes "�j�~���ׂ������Ă邪";
	mes "�����񂹂�l�肪����Ȃ��B";
	mes "�����ŋM�a�̂悤�ȋ����Ȗ`���҂�";
	mes "���͂����߂邱�Ƃɂ����̂��B";
	next;
	mes "[����s���q�m]";
	mes "���E���~�����߂ɂ�";
	mes "�M�a�̗͂��K�v�Ȃ̂��B";
	mes "�ǂ����A��X�ɗ͂�݂��ė~�����B";
	next;
	if(select("���͂�\���o��","�l�������ė~����") == 2) {
		mes "[����s���q�m]";
		mes "�c�c�������B";
		mes "�O�����Ɍ������Ă��炦��Ə�����B";
		mes "���̋C�ɂȂ�����";
		mes "�܂����ɐ��������Ă���B";
		mes "��낵�����ށB";
		close;
	}
	setquest 121135; //state=1
	mes "[����s���q�m]";
	mes "�����c�c�I";
	mes "�Ȃ�ƐS�����፷�����I";
	mes "�M�a�̗͂������";
	mes "�K������f�̉��̕�����";
	mes "�j�~�ł���ɈႢ�Ȃ��I";
	next;
	mes "[����s���q�m]";
	mes "�c�c���Ԃ̓v�����e���̒n��";
	mes "�u�v�����e���[���v�ɂĐi�s���Ă���B";
	mes "�܂��́A�v�����e���̖k���ɂ���";
	mes "�u�v�����e���吹���v��";
	mes "�������Ă��炢�����B";
	next;
	mes "[����s���q�m]";
	mes "�������ɓ�������^�������i��";
	mes "^0000FF��ԍ����̕���^000000�ɓ���̂��B";
	next;
	mes "[����s���q�m]";
	mes "���i�͓���Ȃ���������";
	mes "���̕����ɂ���";
	mes "^0000FF�b�h�́u���v�Ɏ��������^000000���Ƃ�";
	mes "�u�v�����e���[���v�ɐi�߂�B";
	next;
	mes "[����s���q�m]";
	mes "�u�v�����e���[���v�ɓ���������";
	mes "���̃��[�_�[�ł���";
	mes "�u^0000FF�V�L�i^000000�v�l�ɉ";
	mes "�ڂ����b�𕷂��ė~�����B";
	next;
	mes "[����s���q�m]";
	mes "�ł́A�v�����e���吹���O��";
	mes "�ē����悤�B";
	mes "��낵�����ށB";
	close2;
	warp "prontera.gat",232,312;
	end;
}

prt_church.gat,102,61,2	script	�����_�炩�ȉq�m#DeepAb	418,{/* 51221 */
	mes "[�����_�炩�ȉq�m]";
	mes "�Ȃ�Ƌ������Ȑl�Ԃ��c�c";
	mes "���ЋM���̂悤�ȕ���";
	mes "���݂��Ă��炢�����B";
	mes "���A���̐����̉��ő�ςȂ��Ƃ�";
	mes "�N���悤�Ƃ��Ă���̂ł��B";
	next;
	switch(select("�b�𕷂�","�u�v�����e���[���v�ɂ��ĕ���","��������")) {
	case 1:
		mes "[�����_�炩�ȉq�m]";
		mes "���f�̉��ƌĂ΂��";
		mes "���낵�����݂�";
		mes "���̑吹���̒n����";
		mes "�h�낤�Ƃ��Ă���̂ł��B";
		next;
		mes "[�����_�炩�ȉq�m]";
		mes "���f�̉����h���";
		mes "���E�͈łɕ�����ł��傤�B";
		mes "�����j�~���ׂ�";
		mes "�����̒n���A�u�v�����e���[���v��";
		mes "�Ă΂��ꏊ��";
		mes "���m���������Ă���܂��B";
		next;
		mes "[�����_�炩�ȉq�m]";
		mes "������`���Ă���������̂ł����";
		mes "������^�������i��";
		mes "��ԉ��̍���̔��ɂ����肭�������B";
		mes "�������u�v�����e���[���v�ւ�";
		mes "�����ƂȂ��Ă��܂��B";
		close;
	case 2:
		mes "[�����_�炩�ȉq�m]";
		mes "�u�v�����e���[���v��";
		mes "��������̂ł����";
		mes "������^�������i��";
		mes "��ԉ��̍���̔��ɂ����肭�������B";
		next;
		mes "[�����_�炩�ȉq�m]";
		mes "�������u�v�����e���[���v�ւ�";
		mes "�����ƂȂ��Ă��܂��B";
		close;
	case 3:
		mes "^0000FF�]�q�m�̑O���痧���������]^000000";
		close;
	}
}

prt_church.gat,83,122,0	warp	#warpDeepAbyss01	2,2,pab_church.gat,73,79	//51222
pab_church.gat,73,75,0	warp	#warpDeepAbyss02	2,2,prt_church.gat,90,122	//60674
prt_church.gat,73,90,2	script	���Ȃ�b�h#DeepAbyss01	844,{/* 60640 */
	mes "^0000FF�]�ÂтĂ��Ė�������";
	mes "�@�s�v�c�ƌ������Ă��܂��Z���c�c";
	mes "�@�ق�̋͂�����";
	mes "�@���Ȃ�͂���������]^000000";
	next;
	if(select("^0000FF���Ɏ��������^000000","��߂�") == 2) {
		mes "^0000FF�]�n���[����";
		mes "�@�z�����܂�Ă��܂�������";
		mes "�@�C������c�c";
		mes "�@��߂Ă������]^000000";
		close;
	}
	set '@dist,distance(getcharid(3));
	if('@dist == -1 || '@dist > 3) {
		mes "[�n���Ǘ��l]";
		mes "�u�v�����e���[���v��";
		mes "��������̂ł����H";
		mes "�ł�����A�b�h�ɋ߂Â���";
		mes "����������Ă��������B";
		mes "��������΁A���Ȃ�͂̉��b��";
		mes "������ł��傤�B";
		next;
		mes "^0000FF�]�b�h�ɏh��";
		mes "�@���Ȃ�͂̉��b�𓾂�ɂ�";
		mes "�@�b�h�ɋ߂Â��K�v������悤���]";
		mes "�@";
		mes "�@�b�h�ɋ߂Â�";
		mes "�@����������Ă݂悤�]^000000";
		close;
	}
	misceffect 6,""; //self
	mes "^0000FF�]���Ɏ����������";
	mes "�@�܂΂䂢���ɑ̂���܂�";
	mes "�@�₪�Đg�̂������オ��悤��";
	mes "�@�َ��Ȋ��o�ɂƂ��ꂽ�]^000000";
	close2;
	warp "pab_camp.gat",41,186;
	end;
OnInit:
	initnpctimer;
	end;
OnTimer5000:
	misceffect 310, "���Ȃ�b�h#DeepAbyss01"; //60640
	misceffect 367, "���Ȃ�b�h#DeepAbyss01"; //60640
	misceffect 546, "���Ȃ�b�h#DeepAbyss01"; //60640
	initnpctimer;
	end;
}
prt_church.gat,75,86,4	script	�n���Ǘ��l#DeepAbyss01	60,{/* 60641 */
	mes "[�n���Ǘ��l]";
	mes "���̍b�h��";
	mes "���̒n���J�������O�A";
	mes "��̂ɍ��ꂽ���̂���";
	mes "�����Ă��܂��B";
	next;
	mes "[�n���Ǘ��l]";
	mes "�����u�v�����e���[���v��";
	mes "��������̂ł����";
	mes "^FF0000�b�h�ɋ߂Â���^000000";
	mes "������ɂ������Ă��������B";
	mes "���Ȃ�͂��M���𓱂��ł��傤�B";
	close;
}
prt_church.gat,77,79,4	script	�C���m#DeepAbyss01	79,{/* 60642 */
	mes "[�C���m]";
	mes "���̕����̈�ʊJ����";
	mes "�ő��ɍs���܂���̂ŁA";
	mes "���̋@��ɂ�����茩��";
	mes "�s���Ă��������ˁB";
	close;
}
pab_church.gat,81,77,2	script	�Δ�#DeepAbyss01	844,{/* 60643 */}

pab_camp.gat,36,193,6	script	�V�L�i#DeepAbyss01	859,{/* 60645 */}
pab_camp.gat,41,190,3	script	���l�̖�#DeepAbyss01	10045,{/* 60646 */
	mes "^0000FF�]�S�Ă̑������������ꂽ";
	mes "�@�݂��ڂ炵���傪����";
	mes "�@��̌��Ԃ���́A���̐��̑S�Ă�";
	mes "�@�������邩�̂悤��";
	mes "�@�����܂������O���ɂ��ݏo�Ă���]^000000";
	next;
	mes "^0000FF�]��𒲂ׂ悤�Ƌ߂Â���";
	mes "�@�����������|���Ă����]^000000";
	next;
	mes "[�H�H�H]";
	mes "�����{�ʂł����ɋ߂Â��̂�";
	mes "��߂Ă����B";
	next;
	mes "^0000FF�]���������m���Ă���悤���B";
	mes "�@�ޏ��ɘb�𕷂��Ă݂悤�]^000000";
	close;
OnInit:
	initnpctimer;
	end;
OnTimer5000:
	misceffect 487, "���l�̖�#DeepAbyss01"; //60646
	misceffect 589, "���l�̖�#DeepAbyss01"; //60646
	misceffect 826, "���l�̖�#DeepAbyss01"; //60646
	initnpctimer;
	end;
}
pab_camp.gat,36,197,0	script	#�G�t�F�N�g�^�[�Q�b�gDe	139,{/* 60647 */}
pab_camp.gat,46,197,0	script	#�G�t�F�N�g�^�[�Q�b�gDe	139,{/* 60648 */}
pab_camp.gat,36,184,0	script	#�G�t�F�N�g�^�[�Q�b�gDe	139,{/* 60649 */}
pab_camp.gat,46,184,0	script	#�G�t�F�N�g�^�[�Q�b�gDe	139,{/* 60650 */}
pab_camp.gat,48,193,4	script	�������₩�ȉq�m#DeepAb	413,{/* 60651 */
	mes "[�������₩�ȉq�m]";
	mes "���҂����Ă���܂����A�`���ғa�I";
	mes "�܂��͂�����ɂ�����";
	mes "�u^0000FF�V�L�i^000000�v�l����";
	mes "���b�����������������B";
	close;
}
pab_camp.gat,19,190,6	script	�Ђ��ނ��ȉq�m#DeepAbys	417,{/* 60652 */}
pab_camp.gat,40,211,6	script	�Ђ��ނ��ȉq�m#DeepAbys	417,{/* 60653 */}
pab_camp.gat,64,189,4	script	�Ђ��ނ��ȉq�m#DeepAbys	417,{/* 60654 */
	mes "[�Ђ��ނ��ȉq�m]";
	mes "���҂����������A�`���җl�I";
	mes "���̐�́A�����������X�^�[��";
	mes "�p�j����댯�ȏꏊ�ł��B";
	next;
	mes "[�Ђ��ނ��ȉq�m]";
	mes "��ɐi�܂��O�ɂ܂���";
	mes "�u^0000FF�V�L�i^000000�v�l���b�𕷂�";
	mes "�����X�^�[�����̈˗���";
	mes "�󒍂ł���悤�ɂȂ��Ă���";
	mes "���i�݂��������I";
	close;
}
pab_camp.gat,40,168,7	script	�Ђ��ނ��ȉq�m#DeepAbys	417,{/* 60655 */}
pab_camp.gat,16,200,6	script	�܂�ڐ������q�m#DeepAb	417,{/* 60656 */
	mes "[�܂�ڐ������q�m]";
	mes "�M�����͂�݂��Ă�������";
	mes "�`���җl�ł����H";
	mes "���������Ȃ̂ł����";
	mes "�u^0000FF�V�L�i^000000�v�l���";
	mes "���b�𕷂����Ƃ��ł���ł��傤�B";
	close;
}
pab_camp.gat,62,181,4	script	�W�R����q�m#DeepAbyss0	414,{/* 60657 */
	mes "[�W�R����q�m]";
	mes "�M�����O���炫��";
	mes "�`���҂Ƃ�炩�H";
	mes "�ӂށc�c�m���ɐM���ł��������B";
	next;
	mes "[�W�R����q�m]";
	mes "�ڂ����b�́u^0000FF�V�L�i^000000�v�l����";
	mes "���b����������ł��낤�B";
	mes "�܂��̓V�L�i�l�ɂ�����ė~�����B";
	close;
}

pab_camp.gat,30,205,4	script	�⋋����#DeepAbyss01	415,{/* 60659 */}
pab_camp.gat,56,208,4	script	�q�ɊǗ���#DeepAbyss01	405,{/* 60660 */}
pab_camp.gat,54,206,4	script	���C���q��#DeepAbyss01	464,{/* 60661 */}
pab_camp.gat,56,206,4	script	�T�u�q��1#DeepAbyss01	464,{/* 60662 */}
pab_camp.gat,58,206,4	script	�T�u�q��2#DeepAbyss01	464,{/* 60663 */}
pab_camp.gat,25,181,5	script	���L��#DeepAbyss01	805,{/* 60664 */}
pab_camp.gat,49,198,5	script	�A�C�e���̔���#DeepAbys	68,{/* 60665 */}
pab_camp.gat,50,206,5	script	���[�����Δ̔���#DeepAb	853,{/* 60666 */}
pab_camp.gat,46,205,5	script	�Ő����L�b�g�̔�#DeepAb	877,{/* 60667 */}
pab_camp.gat,61,198,4	script	�|�C���g���l#DeepAbyss0	700,{/* 60668 */}
pab_camp.gat,62,206,4	script	�J�V��#DeepAbyss01	83,{/* 60669 */}
pab_camp.gat,65,203,4	script	�����ƃ[�b�N�X#DeepAbys	89,{/* 60670 */}
pab_camp.gat,67,199,4	script	��E�l#DeepAbyss01	516,{/* 60671 */}
pab_camp.gat,24,205,5	script	�~���#DeepAbyss01	95,{/* 60672 */}
pab_camp.gat,20,202,5	script	�R�敨�Ǘ��l#DeepAbyss0	833,{/* 60673 */}
