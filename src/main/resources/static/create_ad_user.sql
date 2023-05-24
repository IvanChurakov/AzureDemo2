cat << EOF > create_ad_user.sql
select * from pgaadauth_create_principal('vanya.churakov01@gmail.com', false, false);
EOF