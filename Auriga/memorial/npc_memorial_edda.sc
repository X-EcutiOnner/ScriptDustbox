//= Auriga Script ==============================================================
// Ragnarok Online Half moon in the Daylight Memorial Script	by refis
//==============================================================================

//============================================================
// NPC
//------------------------------------------------------------
rachel.gat,177,139,3	script	��_���⍲#01	920,{/* 58944 */
	mes "[��_���⍲]";
	mes "���̓j���G����_���l��";
	mes "�⍲�����Ă���҂ł��B";
	mes "���̗͂ł����ɗ��Ă邱�Ƃ������";
	mes "���\���t�����������B";
	while(1) {
		next;
		switch(select("���̉����������","�M���x���m�F����","���̗́A����A�M���x���ĉ��H","���ł��Ȃ��ł�")) {
		case 1:
			mes "[��_���⍲]";
			mes "�ǂ̉���������܂����H";
			next;
			switch(select("�_���̃l�b�N���X�ɃG���`�����g","�_���̃l�b�N���X�����炤","�A���i�x���c�]���T�[�r�X(�v�M���x20)","[�ߑ�] ���ꃋ�[�~��(�v�M���x30)","[�ߑ�] ���ꋳ�c(����)(�v�M���x150)","����ς肢���ł�")) {
			case 1:
				mes "[��_���⍲]";
				mes "�t�^����ɂ�^ff0000�_���̃l�b�N���X^000000��";
				mes "�������Ă���K�v������܂��B";
				next;
				select("�A�N�Z�T���[[1]�]�������Ă��Ȃ�:�A�N�Z�T���[[2]�]�������Ă��Ȃ�:��߂�")
				mes "[��_���⍲]";
				mes "^ff0000�_���̃l�b�N���X^000000��";
				mes "�������Ă��������B";
				close;
			case 2:
				mes "[��_���⍲]";
				mes "�_���̃l�b�N���X�ł��ˁB";
				mes "�����Œ񋟂��Ă��܂��B";
				mes "�������ł��傤���H";
				next;
				if(select("����ς��߂܂�","���炢�܂�") == 1) {
					mes "[��_���⍲]";
					mes "�킩��܂����B";
					mes "�܂����Ă��������ˁB";
					close;
				}
				if(checkitemblank() == 0) {
					mes "[��_���⍲]";
					mes "�ו��̎�ނ������悤�ł��B";
					mes "��x�������Ă��炫�Ă�������";
					close;
				}
				mes "[��_���⍲]";
				mes "������ǂ����B";
				mes "����ł͂��󂯎�肭�������B";
				getitem 28387, 1;
				close;
			case 3:
			case 4:
			case 5:
				mes "[��_���⍲]";
				mes "�M���x������Ȃ��悤�ł��B";
				mes "���̉����";
				mes "�󂯂邱�Ƃ��ł��܂���B";
				close;
			case 6:
				mes "[��_���⍲]";
				mes "�킩��܂����B";
				mes "�܂����Ă��������ˁB";
				close;
			}
		case 2:
			mes "[��_���⍲]";
			mes "���̗͂������Ă݂܂��B";
			mes "���c�l�Ƃ��Ȃ��̐M���x�́c�c";
			next;
			mes "[��_���⍲]";
			mes QUE1_EDDA_INTIMATE +"�ł��I";
			break;
		case 3:
			mes "[��_���⍲]";
			mes "���̒��ŁA";
			mes "���̖������Ă������";
			mes "������ƐM���x��������܂��B";
			next;
			mes "[��_���⍲]";
			mes "���̐M���x�������قǁA";
			mes "���̗͂��傫���Ȃ�܂��B";
			mes "�������̖��̗͂𗘗p����";
			mes "���ʂȗ͂��h�����Ƃ��ł��܂��B";
			mes "���̗͂�����ƌĂ�ł��܂��B";
			next;
			mes "[��_���⍲]";
			mes "���񖲂Ɏ����Ă���������܂��B";
			mes "���Ȃ��ɂ��̕���";
			mes "�����Ă������������̂ł��c�c";
			mes "�ڂ����̓j���G����_���l��";
			mes "���b���f���Ă��������B";
			next;
			mes "[��_���⍲]";
			mes "���̂悤�Ɏ��͖��̗͂������A";
			mes "�͂��Ȃ���͂�";
			mes "�g�����Ƃ��ł��܂��B";
			mes "�ǂ����Ď���";
			mes "���̗͂��g����悤�ɂȂ����̂��c�c";
			mes "^0000FF�ӂӁc�c����ɂ��Ă͔閧�ł�^000000�B";
			break;
		case 4:
			mes "[��_���⍲]";
			mes "�킩��܂����B";
			mes "�܂����Ă��������ˁB";
			close;
		}
	}
}

rachel.gat,174,138,6	script	�j���G����_��#ponir01	915,{/* 58945 */
	if(!(checkquest(14594) & 0x8)) {
		cutin "ra_gwoman.bmp", 2;
		mes "[�j���G����_��]";
		mes "����A���Ȃ��́c�c";
		mes "�ǂ��Ƃ����";
		mes "��������Ⴂ�܂����ˁB";
		next;
		mes "[�j���G����_��]";
		mes "���͏��X���������Ƃ�";
		mes "�Ȃ��Ă���܂��āA";
		mes "�ǂ���Ή�X��";
		mes "���͂��Ă͂��������Ȃ��ł��傤���H";
		next;
		menu "���ł��傤",-;
		mes "[�j���G����_��]";
		mes "�ڍׂ����b������O�Ɉ�A";
		mes "�m�F���Ă��������������Ƃ�";
		mes "����܂��B";
		next;
		mes "[�j���G����_��]";
		mes "���ꂩ�炨�b�����邱�Ƃ�";
		mes "�ɔ鎖���ƂȂ�܂��B";
		mes "���O����΂��Ȃ������łȂ��A";
		mes "����𕷂����l�ɂ�";
		mes "�Ђ����y�Ԃł��傤�B";
		next;
		mes "[�j���G����_��]";
		mes "�{���Ȃ�΁A���Ȃ��̂悤��";
		mes "�`���҂Ɉ˗����邱�Ƃł�";
		mes "����܂���B";
		next;
		mes "[�j���G����_��]";
		mes "�������A����������Ă�";
		mes "���Ȃ��Ɉ˗�������";
		mes "�������̂ł��B";
		mes "���̂��Ƃ��d�X���m����";
		mes "����������悤���肢���܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�܂��A�b�𕷂����ꍇ�ɂ́A";
		mes "�K�����̈˗���";
		mes "�����󂯂Ă��炢�܂��B";
		mes "�f�邱�Ƃ͂ł��܂���B";
		mes "���ꂾ���d��Ȕ閧�Ȃ̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�����̂��Ƃ�";
		mes "����������������������";
		mes "������̈˗���";
		mes "���󂯂��������܂����H";
		next;
		if(select("�킩��܂���","��߂Ă����܂�") == 2) {
			mes "[�j���G����_��]";
			mes "�T�d�ȕ��ł��ˁB";
			mes "�킩��܂����B";
			mes "���̕��������邱�Ƃɂ��܂�";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		mes "[�j���G����_��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���ꂮ����������p��";
		mes "���肢���܂��B";
		cutin "ra_gwoman.bmp", 2;
		next;
		mes "[�j���G����_��]";
		mes "���X���Â��Ă����邩��";
		mes "����܂��񂪁A";
		mes "�b�Ƃ����̂͋��c�l�̂��Ƃł��B";
		next;
		mes "[�j���G����_��]";
		mes "�ŋ߁A���c�l�̂��̂�";
		mes "�ω����N����͂��߂܂����B";
		mes "^0000cd���c�l�̐�������^000000��";
		mes "�ُ�Ȃ܂łɑ������̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�ȑO�͖鑁���Q���ɓ���A";
		mes "���������ڊo�߂ɂȂ��Ă����̂ɁA";
		mes "���X�ɂ��̎��Ԃ�";
		mes "�x���Ȃ��Ă����܂����B";
		next;
		mes "[�j���G����_��]";
		mes "�����Ă��ꂾ���ł͂Ȃ��A";
		mes "�p�ɂɂ�����ɂȂ�悤��";
		mes "�Ȃ�܂����B";
		next;
		mes "[�j���G����_��]";
		mes "�������Ԃ͓��ɓ���";
		mes "���������Ă��܂��B";
		mes "�������c�l�͂������";
		mes "�Ȃ��Ă��܂��B";
		next;
		menu "�����a�C�ɂȂ����̂ł��傤���H",-;
		mes "[�j���G����_��]";
		mes "�����������c�l�̑̂�";
		mes "�����N�����̂ł͂Ȃ����Ǝv���A";
		mes "�l�X�Ȍ��������Ă݂܂������A";
		mes "�ُ�͌�����܂���ł����B";
		mes "�����c�c";
		next;
		mes "[�j���G����_��]";
		mes "�ڊo�߂���͈������\�����������A";
		mes "�S�����ɂ��炸�Ƃ�����������";
		mes "�p���������ɂȂ�܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�����Ă܂������������";
		mes "�Ȃ낤�Ƃ���̂ł��B";
		next;
		menu "���ɍl��������́H",-;
		mes "[�j���G����_��]";
		mes "�S���I�Ȗ��ł͂Ȃ�����";
		mes "�l���Ă��܂��B";
		mes "^0000cd��^000000�̒���";
		mes "���������Ă���̂���";
		mes "����܂���B";
		next;
		mes "[�j���G����_��]";
		mes "��x�����A���ڊo�߂ɂȂ��������";
		mes "^0000cd�Ƒ�^000000�ɂ���";
		mes "���q�˂ɂȂ�ꂽ���Ƃ�����܂����B";
		next;
		menu "���c�l�ɂ��Ƒ��͂��܂����c�c�H",-;
		mes "[�j���G����_��]";
		mes "�͂��B";
		mes "�������_�a�ɂ���������O��";
		mes "�����̂��Ƃ�";
		mes "���ׂĖY��Ȃ���΂Ȃ�܂���B";
		next;
		mes "[�j���G����_��]";
		mes "�����Ă����";
		mes "�Ƒ��ɂ��Ă������ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�ЂƂ̎���ɂ�����l�B";
		mes "�I�΂ꂽ�q�Ƃ��Đ��܂�A";
		mes "�_�a�ɓ��邱�Ƃŏ��_���Ղ�g�Ƃ���";
		mes "���܂�ς��̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "���̂��ߕ\�����ɂ�";
		mes "���c�l�ɑ����̉Ƒ��͂��܂���B";
		next;
		mes "[�j���G����_��]";
		mes "���̂��Ƃ������m�̂͂��̋��c�l��";
		mes "����������ɕ����Ă���";
		mes "�Ƃ������Ƃ́A";
		mes "���Ō������̂Ɋ֌W������̂ł�";
		mes "�Ȃ��ł��傤���B";
		next;
		mes "[�j���G����_��]";
		mes "�������A���̒��̘b�ł��B";
		mes "���������͂����̖��ł͂Ȃ�����";
		mes "�̂ł͂Ȃ����ƍl���Ă��܂��B";
		next;
		mes "[�j���G����_��]";
		mes "���c�l�͐_�a���̐l�Ԃł�";
		mes "�����ȒP�ɂ�����邱�Ƃ�";
		mes "�ł��܂���B";
		next;
		mes "[�j���G����_��]";
		mes "����ȋ��c�l�ɊO���̐l�Ԃ�";
		mes "�閧���ɐڐG����͎̂���̋Ƃł��B";
		mes "�ƂĂ������I�ł͂���܂���B";
		next;
		mes "[�j���G����_��]";
		mes "�������c�c���̒��Ȃ�B";
		mes "���̒��Ȃ�N�ɂ������邱�ƂȂ�";
		mes "���c�l�ƐڐG���邱�Ƃ��ł��܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�����āA���c�l�ɐڐG���Ă����";
		mes "�v����l���ł����A";
		mes "���́c�c�S�����肪����̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "^0000cd�X�̓��A^000000�̒n���[���A";
		mes "�N�g�����i�b�N�X�Ɏ���";
		mes "^0000cd�X�̒��ɕ���^000000����Ă���";
		mes "���c�l�̑o�q�̌Z�A^0000cd���[�~��^000000�c�c�B";
		next;
		mes "[�j���G����_��]";
		mes "�ŋ߂̒����񍐏��ɂ���";
		mes "�N�g�����i�b�N�X�����炩�̉e����";
		mes "�^�����̂��A���[�~������";
		mes "����Ȗ��͂̔�����";
		mes "�����������Ȃ̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�ЂƂ̂�������";
		mes "�������A�������Ԃɐ��܂ꂽ";
		mes "�o�q���m�����������Ă���";
		mes "�̂�������܂���B";
		next;
		mes "[�j���G����_��]";
		mes "���ӎ��̂����ɖ���ʂ���";
		mes "���c�l�̈ӎ��ɐG�ꂽ�Ƃ�����A";
		mes "���̂܂܋��c�l�Ɋ����邱�Ƃ�";
		mes "�\�ł��傤�B";
		next;
		mes "[�j���G����_��]";
		mes "���݂����c�l�̐������Ԃ�";
		mes "���������Ă��邱�Ƃ��l����ƁA";
		mes "�N�������̒��ɗ��߂����Ă��邩�A";
		mes "�������͋��c�l���炪�ڊo�߂邱�Ƃ�";
		mes "����ł���̂ł͂Ȃ�����";
		mes "�������Ă��܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�����ł��Ȃ��ɂ�";
		mes "���c�l�̖��̒��ɓ���A";
		mes "�����N�����Ă���̂���";
		mes "���ė��Ăق����̂ł��B";
		mes "������肪�N�����Ă�����";
		mes "������������Ă��������B";
		next;
		mes "[�j���G����_��]";
		mes "���̒��ɂ�";
		mes "���̏p�ł����肵�܂��傤�B";
		next;
		menu "�ǂ����Ď��ɗ��񂾂̂ł����H",-;
		mes "[�j���G����_��]";
		mes "�ڂ������e�͌����܂��񂪁A";
		mes "���݂̓A���i�x���c�̏󋵂��c�c";
		mes "���ɐ_�a�̓����󋵂�";
		mes "���܂�ǂ�����܂���B";
		next;
		mes "[�j���G����_��]";
		mes "�����ԈႦ��΁A";
		mes "���c�l�̌��݂̏�Ԃ�";
		mes "�����I�ɗ��p�����\����";
		mes "����̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�䂦�ɐ_�a���̂ǂ̔h���ɂ�";
		mes "�΂�Ȃ��O���̐l�ԁA";
		mes "���̂����ł�����x�r������������";
		mes "�`���҂̂��Ȃ���";
		mes "�˗����邱�Ƃɂ����̂ł��B";
		next;
		mes "[�j���G����_��]";
		mes "���c�l�̓A���i�x���c�̊�]�ł���A";
		mes "���ł��B";
		next;
		mes "[�j���G����_��]";
		mes "���ꂪ����Ȃ��ƂɂȂ��Ă��܂��A";
		mes "�������i���ɖ��肩��o�߂Ȃ��Ȃǂ�";
		mes "�������ƂɂȂ��Ă��܂�����c�c�B";
		next;
		mes "[�j���G����_��]";
		mes "���c�l�𖲂̒��Ŏ��Ȃ���A";
		mes "�������������N�����Ă���̂�";
		mes "�ł������Ō�܂�";
		mes "���͂��Ă��������B";
		next;
		mes "[�j���G����_��]";
		mes "���̒��ł��̂ŁA";
		mes "�����N���邩�킩��܂���B";
		mes "���c�l�����������Ă���邩�A";
		mes "�ǂ̂悤�ɔ������邩��";
		mes "�N�ɂ��킩��܂���B";
		mes "���ꂮ����C��t���Ă��������B";
		next;
		mes "[�j���G����_��]";
		mes "���ꂩ��A���̏p��";
		mes "���̒��ɑ����̂�";
		mes "��l�����ł��B";
		mes "���̒��ɓ���ۂɂ�";
		mes "^ff0000��l�ŗ��Ă��������B^000000";
		next;
		mes "[�j���G����_��]";
		mes "����ł͏������o������";
		mes "���ɐ��������Ă��������B";
		setquest 14594; //state=1
		compquest 14594;
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	}
	cutin "ra_gwoman.bmp", 2;
	mes "[�j���G����_��]";
	mes "���̒��ɓ���܂����H";
	next;
	switch(select("���������Ă��炤(�_���W�����쐬)","���̒��ɓ���(�_���W��������)","��߂�")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "[�j���G����_��]";
			mes "���݂܂��񂪁A";
			mes "�p�[�e�B�[���[�_�[�ȊO�̕���";
			mes "���������������܂����B";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
		mdcreate "halfmoon";
		mes "[�j���G����_��]";
		mes "���������ŏ������I���܂��B";
		mes "��낵�����肢���܂��B";
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	case 2:
		mes "[�j���G����_��]";
		mes "�킩��܂����B";
		mes "������I��ł��������B";
		next;
		switch(select("^0000ff���̒��ɓ���(BaseLv70�ȏ�)^000000","^ff0000���[�����̒��ɓ���(BaseLv99�ȏ�)^000000","��߂�")) {
		case 1:
			mes "[�j���G����_��]";
			mes "�ł�^0000ff���̒�^000000�ɑ���܂��B";
			mes "��낵���ł����H";
			next;
			if(select("�͂�","��߂�") == 2) {
				mes "[�j���G����_��]";
				mes "�C���ς��܂������H";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[�j���G����_��]";
				mes "���݂܂��񂪁A";
				mes "�p�[�e�B�[���[�_�[�ȊO�̕���";
				mes "���������������܂����B";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			switch(mdenter("halfmoon")) {
			case 0:
				mes "[�j���G����_��]";
				mes "����ł͖��̒��ɑ���܂��B";
				mes "���c�l����낵�����肢���܂��B";
				announce "�������A���_���W����[halfmoon] �ɓ��ꂵ�܂����@�F�@" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x1,0x00ff99,0x190,12,0,0;
				setquest 14585; //state=1
				set QUE1_EDDA,0;
				// warp "1@pop1.gat",47,133;
				close;
			default:
				mes "[�j���G����_��]";
				mes "�܂����̒��ɑ��鏀����";
				mes "�ł��Ă��܂���B";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
		case 2:
			mes "[�j���G����_��]";
			mes "�ł�^ff0000���[�����̒�^000000�ɑ���܂��B";
			mes "��낵���ł����H";
			next;
			if(select("�͂�","��߂�") == 2) {
				mes "[�j���G����_��]";
				mes "�C���ς��܂������H";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
				mes "[�j���G����_��]";
				mes "���݂܂��񂪁A";
				mes "�p�[�e�B�[���[�_�[�ȊO�̕���";
				mes "���������������܂����B";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
			switch(mdenter()) {
			case 0:
			default:
				mes "[�j���G����_��]";
				mes "�܂����̒��ɑ��鏀����";
				mes "�ł��Ă��܂���B";
				close2;
				cutin "ra_gwoman.bmp", 255;
				end;
			}
		case 3:
			mes "[�j���G����_��]";
			mes "�C���ς��܂������H";
			close2;
			cutin "ra_gwoman.bmp", 255;
			end;
		}
	case 3:
		mes "[�j���G����_��]";
		mes "�킩��܂����B";
		mes "�܂����x�K�˂ė��Ă��������B";
		close2;
		cutin "ra_gwoman.bmp", 255;
		end;
	}
OnInit:
	waitingroom "�^���̌���",0; //58945
	end;
}

1@pop1.gat,50,137,3	script	���c#1hmoon01	936,{/* 80708 */
	if(QUE1_EDDA) {
		npctalk "���ցc�c";
		end;
	}
	cutin "pop_sim.bmp", 2;
	mes "[���c]";
	mes "�e�B���r�[�c�c";
	npctalk "�e�B���r�[�c�c";
	next;
	mes "[���c]";
	mes "�c�c";
	mes "�e�B���r�[�A���Ȃ��B";
	next;
	mes "[���c]";
	mes "�c�c�j���G��";
	next;
	mes "[���c]";
	mes "�j���G���c�c";
	mes "�@";
	mes "�e�B���r�[�c�c";
	npctalk "�j���G���c�c�e�B���r�[�c�c";
	next;
	mes "[���c]";
	mes "�ǂ��ɂ���́c�c�H";
	npctalk "�ǂ��ɂ���́c�c�H";
	next;
	mes "[���c]";
	mes "�c�c";
	mes "�����͂ƂĂ��c�c";
	mes "�Â��c�c";
	npctalk "�c�c�����͂ƂĂ��c�c�Â��c�c";
	next;
	menu "����������",-;
	mes "[���c]";
	mes "�c�c";
	mes "�@";
	mes "�]���c�͂��Ȃ�������";
	mes "�@�������܂΂����������]";
	next;
	select("�����:�j���G���̖��O���o��")
	mes "[���c]";
	mes "�c�c"+ strcharinfo(0) +"�A";
	mes "�`���ҁc�c�H";
	next;
	mes "[���c]";
	mes "�c�c�j���G���Ɍ�����";
	mes "�����́H";
	npctalk "�c�c�j���G���Ɍ����ė����́H";
	next;
	select("�������Ă����̂�����:�e�B���r�[�ɂ��ĕ���")
	mes "[���c]";
	mes "�c�c�e�B���r�[��T���Ă����B";
	npctalk "�c�c�e�B���r�[��T���Ă����B";
	next;
	mes "[���c]";
	mes "�j���G�������ɂ��ꂽ�l�`�c�c";
	npctalk "�j���G�������ɂ��ꂽ�l�`�c�c";
	next;
	mes "[���c]";
	mes "��قǂ܂�";
	mes "�����Ă����̂�";
	mes "������Ȃ��c�c";
	next;
	menu "�������T��",-;
	mes "[���c]";
	mes "�����x���B";
	npctalk "�����x���B";
	next;
	select("������߂�̂͑���:���̏ꏊ�ɂ��邩��")
	mes "[���c]";
	mes "��������Ȃ���";
	mes "�c�c�񑩂�����񂾁B";
	npctalk "��������Ȃ��āc�c�񑩂�����񂾁B";
	next;
	menu "�񑩁H",-;
	mes "[���c]";
	mes "���Ȃ��Ƃ����Ȃ��l������񂾁B";
	mes "�e�B���r�[��T���Ă�����A";
	mes "���ԂɂȂ��Ă��܂����B";
	mes "���낻��s���Ȃ��Ɓc�c";
	npctalk "���Ȃ��Ƃ����Ȃ��l������񂾁B";
	npctalk "�e�B���r�[��T���Ă����玞�ԂɂȂ��Ă��܂����B���낻��s���Ȃ��Ɓc�c";
	next;
	select("�����Ă���:�ꏏ�ɍs���܂�")
	mes "[���c]";
	mes "�ꏏ�ɁH";
	next;
	menu "�l�`���O�Ō����邩��",-;
	cutin "pop_nor.bmp", 2;
	mes "[���c]";
	mes "�c�c�킩�����B������B";
	next;
	mes "[���c]";
	mes strcharinfo(0) +"�A";
	mes "��낵���ˁB";
	mes "�����s�����B";
	close2;
	cutin "pop_nor.bmp", 255;
	set QUE1_EDDA,1;
	hideoffnpc "#1hmoond01"; //80709
	misceffect 140, "#1hmoond01"; //80709
	end;
}

1@pop1.gat,63,139,0	warp	#1hmoond01	1,1,1@pop1.gat,92,143	//80709

1@pop1.gat,100,134,0	warp	#1hmoond03	1,1,1@pop1.gat,99,111	//80710

1@pop1.gat,100,142,3	script	���c#1hmoon03	936,3,3,{/* 80711 */
	npctalk "��Ɂc�c";
	hideonnpc "���c#1hmoon03"; //80711
	end;
}

1@pop1.gat,95,99,6	script	�_��#1hmoon01	935,{/* 80712 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
OnTalk:
	npctalk "���c�l���B";
	end;
}
1@pop1.gat,104,99,4	script	�_��#1hmoon02	920,{/* 80713 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
OnTalk:
	npctalk "���c�l���������������B";
	end;
}
1@pop1.gat,93,97,6	script	�M��#1hmoon01	927,{/* 80714 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
OnTalk1:
	npctalk "���c�l�A���T�����܂����B";
	end;
OnTalk2:
	npctalk "���c�l���������𔲂��o������ȂǁA��̂ǂ��ɂ���ꂽ�̂ł����B";
	end;
}
1@pop1.gat,106,97,4	script	�M��#1hmoon02	917,{/* 80715 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
OnTalk:
	npctalk "���c�l�B���o����s�������Ă��������܂��B";
	end;
}
1@pop1.gat,91,95,6	script	�M��#1hmoon03	926,{/* 80716 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
OnTalk:
	npctalk "���c�l�B���܂�����Ȃ����Ƃ́A���_�t���C���l��J�߂�s�ׂł���B";
	end;
}
1@pop1.gat,108,95,4	script	�M��#1hmoon04	916,{/* 80717 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
}
1@pop1.gat,91,92,6	script	�M��#1hmoon05	926,{/* 80718 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
}
1@pop1.gat,108,92,4	script	�M��#1hmoon06	916,{/* 80719 */
	mes "[�M��]";
	mes "���_�t���C���l��";
	mes "�����삪����܂��悤�ɁB";
	close;
}
1@pop1.gat,100,98,3	script	���c#1hmoon04	936,3,3,{/* 80720 */
	end;
OnTouch:
	mes "�]���c�̂��Ƃɑ吨�̐_����";
	mes "�@�M�҂������W���Ă���]";
	next;
	mes "[�_��]";
	mes "���c�l���B";
	donpcevent "�_��#1hmoon01::OnTalk";
	next;
	mes "[�_��]";
	mes "���c�l���������������B";
	donpcevent "�_��#1hmoon02::OnTalk";
	next;
	mes "[�M��]";
	mes "���c�l�A���T�����܂����B";
	donpcevent "�M��#1hmoon01::OnTalk1";
	next;
	mes "[�M��]";
	mes "���c�l���������𔲂��o������Ȃ�";
	mes "��̂ǂ��ɂ���ꂽ�̂ł����B";
	donpcevent "�M��#1hmoon01::OnTalk2";
	next;
	mes "[�M��]";
	mes "���c�l�B";
	mes "���܂�����Ȃ����Ƃ�";
	mes "���_�t���C���l��J�߂�s�ׂł���B";
	donpcevent "�M��#1hmoon03::OnTalk";
	next;
	mes "[�M��]";
	mes "���c�l�B";
	mes "���o����s����";
	mes "���Ă��������܂��B";
	donpcevent "�M��#1hmoon02::OnTalk";
	next;
	select("�c�c","����H")
	close;
}
1@pop1.gat,89,103,5	script	�x����#1hmoon01	934,{/* 80721 */}
1@pop1.gat,110,103,3	script	�x����#1hmoon02	934,{/* 80722 */}
1@pop1.gat,96,83,5	script	�x����#1hmoon03	934,{/* 80723 */}
1@pop1.gat,103,83,3	script	�x����#1hmoon04	934,{/* 80724 */}
1@pop1.gat,96,80,5	script	�x����#1hmoon05	934,{/* 80725 */}
1@pop1.gat,103,80,3	script	�x����#1hmoon06	934,{/* 80726 */}
1@pop1.gat,96,77,5	script	�x����#1hmoon07	934,{/* 80727 */}
1@pop1.gat,103,77,3	script	�x����#1hmoon08	934,{/* 80728 */}
1@pop1.gat,96,74,5	script	�x����#1hmoon09	934,{/* 80729 */}
1@pop1.gat,103,74,3	script	�x����#1hmoon10	934,{/* 80730 */}
1@pop1.gat,96,71,5	script	�x����#1hmoon11	934,{/* 80731 */}
1@pop1.gat,103,71,3	script	�x����#1hmoon12	934,{/* 80732 */}
1@pop1.gat,96,68,5	script	�x����#1hmoon13	934,{/* 80733 */}
1@pop1.gat,103,68,3	script	�x����#1hmoon14	934,{/* 80734 */}
1@pop1.gat,99,89,7	script	�x����#1hmoon21	934,{/* 80735 (hide)*/}
1@pop1.gat,100,82,1	script	�x����#1hmoon22	934,{/* 80736 (hide)*/}

1@pop1.gat,96,87,7	script	�x����#1hmoon23	934,{/* 80872 (hide)*/}
1@pop1.gat,98,87,7	script	�x����#1hmoon24	934,{/* 80876 (hide)*/}
1@pop1.gat,101,87,1	script	�x����#1hmoon25	934,{/* 80877 (hide)*/}
1@pop1.gat,103,87,1	script	�x����#1hmoon26	934,{/* 80878 (hide)*/}
1@pop1.gat,96,84,7	script	�x����#1hmoon27	934,{/* 80879 (hide)*/}
1@pop1.gat,98,84,7	script	�x����#1hmoon28	934,{/* 80880 (hide)*/}
1@pop1.gat,101,84,1	script	�x����#1hmoon29	934,{/* 80881 (hide)*/}
1@pop1.gat,103,84,1	script	�x����#1hmoon30	934,{/* 80882 (hide)*/}

1@pop1.gat,100,98,3	script	���c#1hmoon02	936,{/* 81303 (hide)*/}

1@pop1.gat,99,68,0	script	#1hmoond05	45,{/* 81528 (hide)*/}
1@pop1.gat,99,54,3	script	���c#1hmoon05	936,{/* 81529 (hide)*/}

1@pop1.gat,100,96,3	script	���c#1hmoon09	936,{/* 81535 (hide)*/}
1@pop1.gat,99,94,3	script	���c#1hmoon10	936,{/* 81536 (hide)*/}
1@pop1.gat,100,92,3	script	���c#1hmoon11	936,{/* 81537 (hide)*/}
1@pop1.gat,97,97,6	script	�M��#1hmoon11	927,{/* 81538 (hide)*/}
1@pop1.gat,102,97,4	script	�M��#1hmoon12	917,{/* 81539 (hide)*/}
1@pop1.gat,97,95,6	script	�M��#1hmoon13	926,{/* 81540 (hide)*/}
1@pop1.gat,102,95,4	script	�M��#1hmoon14	916,{/* 81541 (hide)*/}
1@pop1.gat,97,92,6	script	�M��#1hmoon15	926,{/* 81542 (hide)*/}
1@pop1.gat,102,92,4	script	�M��#1hmoon16	916,{/* 81543 (hide)*/}
1@pop1.gat,101,94,3	script	�_��#1hmoon21	935,{/* 81544 (hide)*/}
1@pop1.gat,98,94,5	script	�_��#1hmoon22	920,{/* 81545 (hide)*/}
1@pop1.gat,96,92,6	script	�M��#1hmoon23	927,{/* 81546 (hide)*/}
1@pop1.gat,103,92,4	script	�M��#1hmoon24	917,{/* 81547 (hide)*/}
1@pop1.gat,96,90,7	script	�M��#1hmoon25	926,{/* 81548 (hide)*/}
1@pop1.gat,103,90,1	script	�M��#1hmoon26	916,{/* 81549 (hide)*/}
1@pop1.gat,101,89,1	script	�M��#1hmoon27	926,{/* 81550 (hide)*/}
1@pop1.gat,98,89,7	script	�M��#1hmoon28	916,{/* 81551 (hide)*/}

